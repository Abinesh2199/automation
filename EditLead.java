package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.className("sectionTabButtonUnselected")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("abinesh");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[89]")).click();
		String text= driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("wipro");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
	
		
		
		
	
		
	}

}
