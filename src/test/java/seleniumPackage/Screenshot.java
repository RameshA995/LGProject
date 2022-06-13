package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {


		public static void main(String[] args) throws InterruptedException {
	        //set the location of chrome browser
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	        
	        // Initialize browser
	        ChromeDriver driver = new ChromeDriver();
	        Thread.sleep(6000);
	        //navigate to url
	        driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
	        driver.manage().window().maximize();
	        System.out.println("Opened");
	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            Files.copy(screenshot, new File("C:\\Screenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        System.out.println("screenshot takend");
	        Thread.sleep(3000);
	        //closing the webdriver
	        driver.close();
	}

}
