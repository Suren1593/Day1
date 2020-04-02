package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mm1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleDay1\\Drivers\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://www.google.com/");
		
		System.out.println("Done");
		
		web.close();
	}

}
