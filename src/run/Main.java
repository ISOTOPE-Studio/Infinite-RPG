package run;

import operation.*;
import character.*;
import control.*;
import localization.Lang;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// Start
		System.out.println("启动中...");
		// System.out.println("====无限地牢====");

		// Properties
		// PropertiesFile.createFile("settings");
		// PropertiesFile.writeProperties("settings.properties", "lang",
		// "Chinese");;
		Lang lang = new Lang("Chinese");

		// GUI

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame jfr = new Win(lang.get("gamename"));
			}
		});

		Player mainPlayer = statusPoint.startStatus();
		System.out.println(mainPlayer.toString());
	}

}
