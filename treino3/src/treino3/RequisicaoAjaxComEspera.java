package treino3;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequisicaoAjaxComEspera {

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
			
			//verifica se o resultado é o mesmo do esperado
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"j_idt339:display\"]"),"anderson"));
			
			
			driver.close();
			
	}

}
