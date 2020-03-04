package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class RESTAPITest {
	
	@Test
	public void restAPITestCode() throws Exception {
		
		//FileInputStream fis = new FileInputStream("c://user//path");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		
		System.out.println("restAPITestCode");
	}

}
