package orangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Navigating to the URL
			driver.manage().window().maximize();
			System.out.println("Successfully Launched");
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();//To get the Title of the URL
		
	}
		
}
	


