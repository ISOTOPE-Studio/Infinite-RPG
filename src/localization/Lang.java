package localization;

import control.PropertiesFile;

public class Lang {
	static String language;

	public static void setLang(String lang) {
		language = lang;
	}

	public static String get(String name) {
		return PropertiesFile.readValue("src/localization/" + language, name);
	}

}
