package first;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public class IN {

	// Variablen der IN Seite
	static String abWo = ""; // ab welchem Pfad sollen alle Bilder gesucht werden...
	static String tableName = "";
	
	static void setAbWo(String s) {
		abWo = s;
	}
	
	static void setTableName(String s) {
		tableName = s;
	}
	
	static void buttonAction(TextArea area) {
		SQL.createPictureTable(tableName); // table wird erstellt
		SQL.insertCustomTableTable(tableName); // name der table wird in CustomTable eingetragen
		Worker.writeTablesOut(area); // CustomTables werden eusgelesen
		SQL.insertIntoDB(PictureFileTree.createAndStorePictureObjects(), tableName);
	}
	
}
