package com.progressive.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	static Properties prop;
	
	static String dir = "./CONFIG/config.properties";

	public static String getValue(String key) throws FileNotFoundException {
		
		String value = null;
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream(dir);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to load the .CONFIG file .."+e.getMessage());
		}

		value = prop.getProperty(key).trim();		
		return value;
		
	}

}
