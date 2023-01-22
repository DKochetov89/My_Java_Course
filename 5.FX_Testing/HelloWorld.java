import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Group(), 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello world!");
        primaryStage.show();
    }
}
