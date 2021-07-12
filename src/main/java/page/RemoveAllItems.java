package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItems {
	WebDriver driver;

	public RemoveAllItems(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLEALL_ELEMENT;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void validateToggleAllIsClicked() {
		TOGGLEALL_ELEMENT.click();
	}
	public void clickOnRemove() {
		REMOVE_BUTTON_ELEMENT.click();
	}
}