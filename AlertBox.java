import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

	public static void display( String title, String msg ) {
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label lbl = new Label();
		lbl.setText(msg);
		Button cbt = new Button("close me.");
		cbt.setOnAction( e -> window.close() );
		VBox lyt = new VBox(10);
		lyt.getChildren().addAll(lbl, cbt);
		lyt.setAlignment(Pos.CENTER);

		Scene sc = new Scene(lyt);
		window.setScene(sc);
		window.showAndWait();
	}

}