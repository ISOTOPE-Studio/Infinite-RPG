package localization;

import control.PropertiesFile;

public class Lang {
	String language;

	public Lang(String lang) {
		language = lang;
	}

	public String get(String name) {
		return PropertiesFile.readValue("src/localization/" + language, name);
	}

}
