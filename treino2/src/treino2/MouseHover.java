package treino2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String pathChrome = "C:\\Users\\ander\\Desktop\\AUTOMACAO SELENIUM\\DRIVERS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChrome);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.dafiti.com.br");
		
		Thread.sleep(3000);
	
		Actions seleciona = new Actions(driver);
		seleciona.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[3]/div/div/div/div/ul/li[2]"))).build().perform();
		
		Thread.sleep(3000);

		WebElement elemento1 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[3]/div/div/div/div/ul/li[2]/div/div[1]/ul/li[5]/a"));
		elemento1.click();
	}

}
