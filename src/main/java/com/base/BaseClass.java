package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//
public class BaseClass {
	
	
	//all drivers
	
		public static WebDriver driver;
		public static Properties pop;
		public static FileInputStream file;
		public BaseClass() {
			 pop=new Properties();
			 try {
				file= new FileInputStream("C:\\Users\\arif0\\eclipse-workspace\\AutomationWorkshop\\src\\main\\java\\com\\config\\config.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			 try {
				pop.load(file);
				System.out.println("fileload");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			 
		}
		public  static void setUp() {
			
			String webBrowser = pop.getProperty("browser");

			if (webBrowser.equalsIgnoreCase(pop.getProperty("google chrome"))) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (webBrowser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (webBrowser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.get(pop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
}
