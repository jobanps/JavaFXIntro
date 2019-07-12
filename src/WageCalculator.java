import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WageCalculator extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primarystage) throws Exception {
		
		// UI elements
		
		Label headLabel = new Label("Welcome to Wage Calculator");
		Label nameLabel = new Label("Enter your name");
		Label hoursLabel = new Label("Enter hours worked");
		Label rateLabel = new Label("Enter hourly rate");
		Label resultLabel = new Label();
		
		TextField nameTextbox = new TextField();
		TextField hourTextbox = new TextField();
		TextField rateTextbox = new TextField();
		
		Button calcButton = new Button("Calculate");
		
		calcButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		        // Logic for what should happen when you push button
		    	double wage = Double.parseDouble(hourTextbox.getText()) * Double.parseDouble(rateTextbox.getText()); 
		    	resultLabel.setText( nameTextbox.getText() +" earned $" + wage);
		    	nameTextbox.setText("");
				hourTextbox.setText("");
				rateTextbox.setText("");
		    }
		});
		
		//layout manager
		
		VBox root = new VBox();
		root.setSpacing(30);
		
		root.getChildren().add(headLabel);
		root.getChildren().add(nameLabel);
		root.getChildren().add(nameTextbox);
		root.getChildren().add(hoursLabel);
		root.getChildren().add(hourTextbox);
		root.getChildren().add(rateLabel);
		root.getChildren().add(rateTextbox);
		root.getChildren().add(calcButton);
		root.getChildren().add(resultLabel);
		
		//set scene
		Scene scene = new Scene(root, 300, 500);
	
		
		//stage
		primarystage.setScene(scene);
		primarystage.setTitle("Wage Calculator");
		
		//show
		primarystage.show();
		
	
		
	}

}
