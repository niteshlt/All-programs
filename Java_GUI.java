import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label label = new Label("Hello, JavaFX!");

        // Create a button
        Button button = new Button("Click Me");
        button.setOnAction(event -> label.setText("Button Clicked!"));

        // Create a layout and add the label and button
        StackPane root = new StackPane();
        root.getChildren().add(label);
        root.getChildren().add(button);

        // Create a scene and set it in the stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the window title and show it
        primaryStage.setTitle("JavaFX Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
