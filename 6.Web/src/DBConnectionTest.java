package web.jdbc;

import com.sun.rowset.RowSetFactoryImpl;

import javax.sql.rowset.CachedRowSet;
import java.sql.*;

public class DBConnectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "User";
        String password = "1234";
        String connectionURL = "URL";
        Class.forName("driver");
        // создаем подключение и далее через класс Statement используеем DML DDL
        try (Connection connection = DriverManager.getConnection(userName, password, connectionURL)) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TEST_TABLE");
            statement.executeUpdate("INSERT INTO TEST_TABLE (name, dt) VALUES ('NewName', { d 01-01-2000 })");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST_TABLE");
            System.out.println(resultSet.getMetaData());
            while (resultSet.next()) {
                System.out.println(resultSet.getString(0));
            }

            // кэшированный сет - не требует постоянного подключения к БД
            CachedRowSet cachedRowSet = new RowSetFactoryImpl().createCachedRowSet();
            System.out.println(cachedRowSet.getTableName());

            // PreparedStatement - избавляемся от инъекций
            int userId = 1;
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM TEST_TABLE WHERE id = ?",
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // параметры скролла
            preparedStatement.setInt(1, userId);

            // CallableStatement - используем подготовленную процедуру для операций с данными
            CallableStatement callableStatement = connection.prepareCall("{ call MyProcedure() }");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            System.out.println(callableStatement.getArray(1));

            // получение метаданных о бд
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData.getDriverName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
