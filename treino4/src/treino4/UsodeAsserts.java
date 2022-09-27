package treino4;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsodeAsserts {
	@Test
	public  void main() {
		// TODO Auto-generated method stub

		
		String exePathChrome = "C:\\Users\\ander\\Desktop\\AUTOMACAO SELENIUM\\DRIVERS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePathChrome);
		WebDriver driver = new ChromeDriver();
		
			
			String appUrl = "https://www.primefaces.org/showcase/ui/ajax/basic.xhtml";
			driver.manage().timeouts().implicitlyWait(90000, TimeUnit.MILLISECONDS);
			
			driver.manage().window().maximize();
			driver.navigate().to(appUrl);
			
			driver.findElement(By.xpath("//*[@id='j_idt339:name']")).sendKeys("anderson");;
			driver.findElement(By.cssSelector("#j_idt339\\:j_idt343 > span")).submit();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"j_idt339:display\"]"),"anderson"));
			
			String verifica = driver.findElement(By.id("j_idt339:display")).getText();
			//informa se o teste passou comparando o nome mostrado com o que foi submetido
			//se for diferente o nome esperado, o teste falhara
			assertEquals("falha","anderson",verifica); 
			driver.close();
	}

}
