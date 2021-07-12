package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItems;
import util.BrowserFactory;

public class ValidateTest3 {
	
	WebDriver driver;
	
	@Before
	public void browserTest() {

		driver = BrowserFactory.init();
	}

	@Test
	public void removeAllItemTest() {
		RemoveAllItems RemoveAllItemsPage = PageFactory.initElements(driver, RemoveAllItems.class);
		RemoveAllItemsPage.validateToggleAllIsClicked();
		RemoveAllItemsPage.clickOnRemove();
		
		
		BrowserFactory.tearDown();
		
	}

}
