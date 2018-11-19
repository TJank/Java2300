import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class App extends Application {

    public void start(Stage stage) {
        try {
            URL url = getClass().getResource("app_view.fxml");
            VBox root = FXMLLoader.load(url);
            Scene scene = new Scene(root, 400, 400);

            stage.setScene(scene);
            stage.setTitle("Tip Calculator");
            stage.show();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
