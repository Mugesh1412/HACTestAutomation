package commonutilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ReusableUtility {
	WebDriver driver;
	
	public ReusableUtility(WebDriver driver) {
		this.driver=driver;

	}

	public By waitForElementToAppear(By webele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(webele));
		return webele;
	}
	
	public By waitForElementToDisAppear(By webele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(webele));
		return webele;
	}
	
	public void scroolByPixelValue(Integer x, Integer y) {   
 
		JavascriptExecutor js = (JavascriptExecutor) driver;                                                                                                                                                                                                                                          
		js.executeScript("window.scrollTo("+x+","+y+")", "");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}    
	
	public void javaScriptClick(WebElement Element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Element);
	}

}
    