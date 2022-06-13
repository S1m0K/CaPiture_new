package first;

public class MANI {
	public static Object LGBTQIA;
	// Variablen der MANI Seite
	private static String renameTo_area = "";
	private static String restoreTo_area = "";
	private static Pictures ps;
	private static int picIndex = 0;
	
	static void selectAction(String selectedTable) {
		ps = SQL.selectAll(selectedTable);
		MANI_graphic.showPic(ps.getPicture(picIndex));
	}
	static void selectPrevious() {
		MANI_graphic.showPic(ps.getPicture(picIndex-1));
	}
	static void selectNext() {
		MANI_graphic.showPic(ps.getPicture(picIndex+1));
	}
}
