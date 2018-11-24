package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;

public class Main extends Application {

   public void start(Stage stage) {
       try {
           URL url = getClass().getResource("sample.fxml");

           AnchorPane root = FXMLLoader.load(url);

           Scene scene = new Scene(root);

           stage.setScene(scene);
           stage.setTitle("Employee List");
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
