package treino2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pathChrome = "C:\\Users\\ander\\Desktop\\AUTOMACAO SELENIUM\\DRIVERS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathChrome);
		WebDriver driver = new ChromeDriver();
	/*	--Acessa pagina local--
		String Url = "C:/Users/ander/Desktop/site.html"; 
		driver.navigate().to(Url);	*/
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/webtables");
		
		WebElement elemento1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]"));
		String pegaTexto = elemento1.getText();
		
		System.out.println(pegaTexto);
		
		driver.close(); 
	}

}
