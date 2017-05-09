import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Confirm {

	static boolean ans;

	public static boolean display( String title, String msg ) {
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label lbl = new Label();
		lbl.setText(msg);
		
		// 2 btns
		Button y = new Button("Yes");
		Button n = new Button("No");

		y.setOnAction(e -> {
			ans = true;
			window.close();
		});

		n.setOnAction(e -> {
			ans = false;
			window.close();
		});

		VBox lyt = new VBox(10);
		lyt.getChildren().addAll(lbl, y, n);
		lyt.setAlignment(Pos.CENTER);

		Scene sc = new Scene(lyt);
		window.setScene(sc);
		window.showAndWait();

		return ans;
	}

}