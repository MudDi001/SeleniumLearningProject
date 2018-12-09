package phantomjspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.setProperty("phantomjs.binary.path",projectPath+"\\lib\\phantomjs\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://seleniumhq.org/");
		System.out.println("The tile of the page is: "+driver.getTitle());
		driver.quit();
	}

}
