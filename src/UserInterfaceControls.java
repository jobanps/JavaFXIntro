import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserInterfaceControls extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label headLabel = new Label("Hello World !!");
		
		TextField textbox = new TextField();
		
		Button button = new Button("Click Here !");
		
		ComboBox<String> list = new ComboBox<String>();
		list.getItems().add("Canada");
		list.getItems().add("India");
		list.getItems().add("USA");
		list.getItems().add("England");
		
		RadioButton radioButton = new RadioButton();
		//radioButton.
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
