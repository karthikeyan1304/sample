package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configurationreader {
	Properties p;
	
	public Configurationreader() throws Throwable {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\propertyfile\\Adactin.properties");
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);

	}
	public String getbrowser() {
		String browser = p.getProperty(getbrowser());
		return browser;

	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getusername() {
		String username = p.getProperty("username");
		return username;

	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;

	}


}
