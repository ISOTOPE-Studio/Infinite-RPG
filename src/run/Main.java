package run;

import operation.*;
import character.*;
import control.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// Start
		System.out.println("启动中...");
		System.out.println("====无限地牢====");

		// Properties
		// PropertiesFile.createFile();
		// PropertiesFile.writeProperties("save.properties", "test", "true");;

		// GUI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame jfr = new Win("无限地牢");
			}
		});
		
		Player mainPlayer = statusPoint.startStatus();
		System.out.println(mainPlayer.toString());
	}

}
