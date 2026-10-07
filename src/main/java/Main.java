import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // PRESTAMO DE MATERIAL

        FXMLLoader fxmlLoader =
                new FXMLLoader(Main.class.getResource("/prestamo.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 500, 300);

        stage.setTitle("Mi primera aplicación JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}