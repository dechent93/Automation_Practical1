package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveButton;
import page.ToggleAll;
import util.BrowserFactory;

public class ValidateTest2 {
	
	WebDriver driver;
	
	@Before
	public void browserTest() {

		driver = BrowserFactory.init();
	}

	@Test
	public void removeSingleItemTest() {
		RemoveButton removeButtonPage = PageFactory.initElements(driver, RemoveButton.class);
		removeButtonPage.checkSingleListItem();
		removeButtonPage.clickOnRemoveButton();
		
		
//		BrowserFactory.tearDown();
	}
}
