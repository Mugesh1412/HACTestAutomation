package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws IOException, AWTException {
		
		/*ProcessBuilder notpad = new ProcessBuilder("C:\\Windows\\System32\\Notepad.exe");
		notpad.start();
		
		Robot re = new Robot();
		re.keyPress(KeyEvent.VK_M);
		re.keyRelease(KeyEvent.VK_M);
		
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);*/
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("selenium");
		
		Robot re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);
		
	}  

}
