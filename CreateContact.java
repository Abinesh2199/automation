package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//lunch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("abinesh");
		driver.findElement(By.id("lastNameField")).sendKeys("r");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("aravind");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("mechanical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("mechanical boys");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abineshabi1999@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("New Mexico");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("mechanical boys");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		String tittle =driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(tittle);
		
		
		
		
		
		
		
		
		

}}
