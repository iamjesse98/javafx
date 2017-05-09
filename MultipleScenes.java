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
public class MultipleScenes extends Application {
	Stage window;
	Scene scene1, scene2;
	public static void main( String[] args ) {
		launch(args);
	}
	
	@Override
	public void start( Stage primaryStage ) throws Exception {
		window = primaryStage;

		Label label1 = new Label("Welcome to the first scene.");

		Button btn1 = new Button("Go to scene2");

		btn1.setOnAction( e -> window.setScene(scene2) );

		// Layout 1 - children are laid out in vertical col.
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, btn1);

		scene1 = new Scene( layout1, 200, 200 );

		// btn - 2
		Button btn2 = new Button("Go to scene1");

		btn2.setOnAction( e -> window.setScene(scene1) );

		// layout2
		StackPane layout2 = new StackPane();

		layout2.getChildren().add(btn2);

		scene2 = new Scene(layout2, 600, 300);

		// default
		window.setScene(scene1);
		window.setTitle("Title Here...");
		window.show();

	}
}

//C:\Program Files\Java\jdk1.8.0_121\bin