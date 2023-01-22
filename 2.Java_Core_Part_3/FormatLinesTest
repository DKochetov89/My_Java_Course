import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class FormatLinesTest {

    public static void main(String[] args) {
        String str = "{0, date, full} было {1, number} сообщений";
        String newStr = MessageFormat.format(str, new GregorianCalendar(
                2000, 01, 01).getTime(), 10);
        System.out.println(newStr);
    }
}
