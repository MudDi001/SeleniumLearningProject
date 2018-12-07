package seleniumTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleSeleniumtest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath+"\\lib\\geckodriver\\geckodriver.exe");
		////System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox");
		//WebDriver driver = new MarionetteDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/");
		driver.quit();
	} 

}
