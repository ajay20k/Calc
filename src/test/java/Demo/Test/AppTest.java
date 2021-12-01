package Demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
    @BeforeTest
	public void test() {
		System.setProperty("webdriver.chrome.driver", "src/test/java/Resources/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
	}
    @AfterTest
    public void exit() {
    	driver.close();
    }

	@Test(priority = 0)
	public void Multiplication() {

		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='×']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		String Actual_Result = driver.findElement(By.id("sciOutPut")).getText().trim();
		Assert.assertEquals(Actual_Result, "222075");
		System.out.println("Multiplication Result= " + Actual_Result);
	}

	@Test(priority = 1)
	public void Division() {

		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='/']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		String Actual_Result = driver.findElement(By.id("sciOutPut")).getText().trim();
		Assert.assertEquals(Actual_Result, "20");
		System.out.println("Division Result= " + Actual_Result);
	}

	@Test(priority = 2)
	public void Addition() {
		driver.findElement(By.xpath("//span[normalize-space()='(']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()=')']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='+']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		String Actual_Result = driver.findElement(By.id("sciOutPut")).getText().trim();
		Assert.assertEquals(Actual_Result, "111111");
		System.out.println("Addition Result= " + Actual_Result);
	}

	@Test(priority = 3)
	public void Subtraction() {

		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='(']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()=')']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		String Actual_Result = driver.findElement(By.id("sciOutPut")).getText().trim();
		Assert.assertEquals(Actual_Result, "23329646");
		System.out.println("Subtraction Result= " + Actual_Result);
		
	}
}

