import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class IntroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create UI Components
		Button button = new Button();
		button.setText("Click Here");
		//Put UI Components inside a container
		StackPane root = new StackPane();
		root.getChildren().add(button);
		// add the container to the scene
		primaryStage.setScene(new Scene(root,300,200));
		primaryStage.setTitle("My First FX Code");
		//show the scece
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
