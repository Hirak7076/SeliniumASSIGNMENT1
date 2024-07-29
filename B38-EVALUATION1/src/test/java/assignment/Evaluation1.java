package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Evaluation1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranga Akunuri");
		Thread.sleep(2000);
		//List<WebElement> ele = driver.findElements(By.xpath("//div[@class-'oxd-autocomplete-dropdown --positon-botton']"));
		//for (WebElement element : ele) {

			// System.out.println(ele.getText());

			//if (element.getText().equals("Ranga Akunuri")) {
			//	Thread.sleep(2000);
			//	element.click();
			//}
		//}
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();

				
		
		
		
	

}
}
