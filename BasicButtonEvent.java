import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BasicButtonEvent extends Application implements EventHandler<ActionEvent> {
	Button button;
	public static void main( String[] args ) {
		launch(args); // this method is from Application
	}
	// start is a method from Application class
	@Override
	public void start( Stage primaryStage ) throws Exception {
		primaryStage.setTitle("Title of the window");
		button = new Button();
		button.setText("Click me!!!");

		button.setOnAction(this);

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle( ActionEvent event ) {
		if( event.getSource() == button ) System.out.println("Hello");
	}
}
