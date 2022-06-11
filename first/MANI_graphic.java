package first;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MANI_graphic {
	
	static TextArea tables3 = new TextArea();

	static void start_MANI_graphik(HBox hb) {
		VBox MANIvb1 = new VBox(); // große vertikale Boxen von MANI
		VBox MANIvb2 = new VBox();

		HBox zeile1_links_MANI = new HBox();
		HBox zeile2_links_MANI = new HBox();
		HBox zeile3_links_MANI = new HBox();
		HBox zeile4_links_MANI = new HBox();
		HBox zeile5_links_MANI = new HBox();
		HBox zeile6_links_MANI = new HBox();
		HBox zeile7_links_MANI = new HBox();
		HBox zeile1_rechts_MANI = new HBox();

		// linke Seite
		Font f = new Font(20);
		Label existingTable3 = new Label("Existing Tables:");
		Button select_table = new Button("Select Tabelle:");
		TextArea select_table_area = new TextArea();
		Button rename_label = new Button("Rename to:");
		TextArea rename_area = new TextArea();
		Button restore_label = new Button("Restore to:");
		TextArea restore_area = new TextArea();
		Button delete = new Button("DELETE");
		TextArea output3 = new TextArea();
		delete.setMinSize(80, 40);
		select_table_area.setMaxSize(150, 15);
		rename_area.setMaxSize(150, 15);
		restore_area.setMaxSize(150, 15);
		tables3.setMaxSize(500, 250);
		output3.setMaxSize(500, 50);
		select_table.setFont(f);
		rename_label.setFont(f);
		restore_label.setFont(f);
		existingTable3.setFont(f);
		tables3.setEditable(false);
		output3.setEditable(false);

		// rechte Seite
		Button links = new Button("<--");
		Button rechts = new Button("-->");
//		Image image = new Image("images/test.jpg");
//		ImageView img = new ImageView(image);
//		img.setFitWidth(500);
//		img.setFitHeight(350);

		zeile1_links_MANI.getChildren().addAll(select_table, select_table_area);
		zeile2_links_MANI.getChildren().addAll(rename_label, rename_area);
		zeile3_links_MANI.getChildren().addAll(restore_label, restore_area);
		zeile4_links_MANI.getChildren().add(delete);
		zeile5_links_MANI.getChildren().add(existingTable3);
		zeile6_links_MANI.getChildren().add(tables3);
		zeile7_links_MANI.getChildren().add(output3);

		zeile1_rechts_MANI.getChildren().addAll(links, rechts);

		MANIvb1.getChildren().addAll(zeile1_links_MANI, zeile2_links_MANI, zeile3_links_MANI, zeile4_links_MANI, zeile5_links_MANI, zeile6_links_MANI, zeile7_links_MANI);
		MANIvb2.getChildren().addAll(zeile1_rechts_MANI);
		hb.getChildren().addAll(MANIvb1, MANIvb2);
		
	}
	
}
