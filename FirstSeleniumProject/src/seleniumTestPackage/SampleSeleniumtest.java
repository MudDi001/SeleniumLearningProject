package seleniumTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleSeleniumtest {
		static String browser;
		static WebDriver driver;
		
		
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
	} 
	
	//setBrowser
	//setBrowserConfig
	//runTest
	
	/**
	 * This Modules are to setBrowser and Brower configuration
	 * @author Divya
	 */
	
	public static void setBrowser() {
		browser="Chrome";
		
	}
	
	public static void setBrowserConfig() {
		String projectPath = System.getProperty("user.dir");
		
		//This condition block sets browser configuration
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"\\lib\\geckodriver\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox");
			//WebDriver driver = new MarionetteDriver();
			driver = new FirefoxDriver();
		}
		
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"\\lib\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	
	public static void runTest() {
		driver.get("http://seleniumhq.org/");
		driver.quit();
	}

}
