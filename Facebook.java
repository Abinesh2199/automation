package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("abinesh");
		driver.findElement(By.name("lastname")).sendKeys("r");
		driver.findElement(By.name("reg_email__")).sendKeys("9629540570");
		driver.findElement(By.id("password_step_input")).sendKeys("abinesh@99");
		WebElement date = driver.findElement(By.id("day"));
		Select Date =new Select(date);
		Date.selectByValue("21");
		driver.findElement(By.id("month")).sendKeys("Jul");
		
//		WebElement month = driver.findElement(By.id("month"));
//		Select Month =new Select(month);
//		Month.selectByIndex(7);
		WebElement year = driver.findElement(By.id("year"));
		Select Year =new Select(year);
		Year.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
		
	}

}
