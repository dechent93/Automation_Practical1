package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.BrowserFactory;

public class LaunchTest extends BrowserFactory {
	
	WebDriver driver;
	
	@Test
	public void browserTest() {
		
		driver= BrowserFactory.init();	
		
		
	}
	

}
