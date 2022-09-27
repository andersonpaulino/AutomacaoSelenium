package treino1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscaQualquer {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		String exePathChrome = "C:\\Users\\ander\\Desktop\\AUTOMACAO SELENIUM\\DRIVERS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePathChrome);
		WebDriver driver = new ChromeDriver();
		
		
			String appUrl = "http://www.google.com";
			int time = 3000;
			
			driver.manage().window().maximize();
			driver.navigate().to(appUrl);
			
			WebElement elemento = driver.findElement(By.name("q"));
			elemento.sendKeys("youtube");
			elemento.sendKeys(Keys.ENTER);
			
			WebElement element2 = driver.findElement(By.partialLinkText("YouTube"));
			element2.click();
			
			Thread.sleep(time);
			
		
			
			Thread.sleep(time);
			
			driver.close();
		
	}

}
