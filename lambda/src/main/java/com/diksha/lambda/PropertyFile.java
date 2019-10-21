package com.diksha.lambda;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream fin=new FileInputStream("lambda.properties");
	prop.load(fin);
	System.out.println(fin.toString());
	String s=prop.getProperty("user");
	System.out.println(s);
	prop.setProperty("diksha","234");
	FileOutputStream fos=new FileOutputStream("lambda.properties");
	prop.store(fos, "hello");
	
	
}
}
