import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// linking to new pages
public class ConfirmBox extends Application {
	Stage window;
	Button btn;
	public static void main( String[] args ) {
		launch(args);
	}
	
	@Override
	public void start( Stage primaryStage ) throws Exception {
		window = primaryStage;

		btn = new Button("Click Me!!!");

		btn.setOnAction( e -> {
			boolean res = Confirm.display("confirm", "Are you sure?");
			System.out.println(res);
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(btn);

		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.setTitle("Title Here...");
		window.show();

	}
}

//C:\Program Files\Java\jdk1.8.0_121\bin