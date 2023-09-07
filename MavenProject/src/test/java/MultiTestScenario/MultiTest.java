package MultiTestScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MultiTest{
	
	
	WebDriver driver;
	@BeforeClass
	public void Initalization()
	{
	
	driver = new ChromeDriver();
	driver.get("https://www.icicibank.com/");
	driver.manage().window().maximize();
	}
	
    @Test
	public void Test1() throws Exception {
		

	Thread.sleep(3000);
	WebElement Cards = driver.findElement(By.xpath("(//span[text()='Cards'])[1]"));

	Actions Act = new Actions(driver);
	Act.moveToElement(Cards).perform();

	WebElement CC = driver.findElement(By.xpath("//a[label='Credit Cards']"));
	Thread.sleep(2000);

	Act.moveToElement(CC).perform();

	List<WebElement> Li = driver.findElements(By.xpath("(//div[@class='tab-menu-list'])[5]"));

	for(int i=0; i<Li.size();i++)  // credit cards list item names print
	{
		System.out.println(Li.get(i).getText());
	}

	WebElement DC = driver.findElement(By.xpath("//a[label='Debit Cards / ATM Card']"));
	Thread.sleep(2000);

	Act.moveToElement(DC).perform();

	WebElement PC = driver.findElement(By.xpath("//a[label='Prepaid / Forex / Gift / Fastag Cards']"));
	Thread.sleep(2000);

	Act.moveToElement(PC).perform();

	WebElement ComCard = driver.findElement(By.xpath("//a[label='Commercial Cards']"));
	Thread.sleep(2000);

	Act.moveToElement(ComCard).perform();
	

	}


   @Test 
   public void Test2() throws Exception {
	   
	   
		Thread.sleep(3000);
		WebElement Cards = driver.findElement(By.xpath("(//span[text()='Cards'])[1]"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(Cards).perform();
		
		WebElement CC = driver.findElement(By.xpath("//a[label='Credit Cards']"));
		Thread.sleep(2000);
   }

		
		@AfterClass
		public void CleanUp() {
			
		
		driver.quit();
	   
   }
}
