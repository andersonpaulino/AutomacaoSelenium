package treino2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pathChrome = "C:\\Users\\ander\\Desktop\\AUTOMACAO SELENIUM\\DRIVERS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChrome);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		
		WebElement elemento1 = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		elemento1.click();
		elemento1.sendKeys("ANDERSON");
		elemento1.sendKeys(Keys.TAB);
		
		WebElement elemento2 = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		elemento2.click();
		elemento2.sendKeys("M");
		elemento2.sendKeys(Keys.TAB);
		
		WebElement elemento3 = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		elemento3.click();
		elemento3.sendKeys("xxxx456@yahoo.com");

		
		WebElement elemento4 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		elemento4.click();
		
		WebElement elemento5 = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
		elemento5.sendKeys("6799998888");
		
		//continua...
		
		
	}

}
