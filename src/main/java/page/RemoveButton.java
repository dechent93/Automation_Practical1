package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButton {

	WebDriver driver;

	public RemoveButton(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "todo[3]")
	WebElement SINGLE_LIST_ELEMENT;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void checkSingleListItem() {
		SINGLE_LIST_ELEMENT.click();

	}

	public void clickOnRemoveButton() {
		REMOVE_BUTTON_ELEMENT.click();
	}

}
