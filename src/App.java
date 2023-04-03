import control.MainControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        MainControl mainControl = new MainControl();
        Scene scene = new Scene(mainControl.getMainView());
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();
    }
}
