package test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.RemoveButton;
import page.ToggleAll;
import util.BrowserFactory;

public class ValidateTest1 {

	 WebDriver driver;

	@Before
	public void browserTest() {
		
		driver= BrowserFactory.init();
	}

	@Test
	public void toggleAllCheckedTest() {
		
		ToggleAll toggleAllPage = PageFactory.initElements(driver, ToggleAll.class);
		toggleAllPage.validateToggleAll();

		
//		BrowserFactory.tearDown();
	}

}
