package Project.Admin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAdmin extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Admin");
        primaryStage.setScene(scene);
        ((Controller) fxmlLoader.getController()).clientAdmin = new Client(Integer.parseInt(getParameters().getUnnamed().get(0)));
        primaryStage.show();
    }
}
