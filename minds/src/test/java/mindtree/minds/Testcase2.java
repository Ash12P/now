package mindtree.minds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testcase2 {

    @Test
	public static void Test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//span[@class= 'header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class= 'signup-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#spree_user_email")).click();
		driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("ashwinpatil563@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("kabutarjaja13");

		driver.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
