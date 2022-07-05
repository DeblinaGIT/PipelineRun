package CICDProject.CICDProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	@Test
	public void test()
	{
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
