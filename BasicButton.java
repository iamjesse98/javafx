import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BasicButton extends Application {
	public static void main( String[] args ) {
		launch(args); // this method is from Application
	}
	// start is a method from Application class
	@Override
	public void start( Stage primaryStage ) throws Exception {
		primaryStage.setTitle("Title of the window");
		Button button = new Button();
		button.setText("Click me!!!");

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

//C:\Program Files\Java\jdk1.8.0_121\bin