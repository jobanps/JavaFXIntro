import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstForm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//1. create and configure user interface controls
		
		//Labels
		Label headLabel = new Label("Hello World ! ");
		Label lblName = new Label("Enter Name ");
		Label lblResult = new Label();
		//Text box
		TextField textFieldName = new TextField();
		
		//button
		Button goButton = new Button();
		goButton.setText("Click Here !");
		
		goButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		        // Logic for what should happen when you push button
		    	lblResult.setText("Hello " + textFieldName.getText());
		    }
		});
		
				
		//2. make a layout manager
		
		VBox root = new VBox();
		root.setSpacing(20);

		//3. add controls to the layout manager
		
		root.getChildren().add(headLabel);
		root.getChildren().add(lblName);
		root.getChildren().add(textFieldName);
		root.getChildren().add(goButton);
		root.getChildren().add(lblResult);
		
		//4. add layout manager to scene
		//5. add scene to a stage
		
		primaryStage.setScene(new Scene(root,300,250));
		primaryStage.setTitle("My First FX Code");
		
		
		//6. show the app
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

