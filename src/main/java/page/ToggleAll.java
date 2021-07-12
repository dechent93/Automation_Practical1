package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAll {
	
	WebDriver driver;
	

	public ToggleAll(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.NAME, using="allbox") WebElement TOGGLEALL_ELEMENT;
	
	public void validateToggleAll() {
		TOGGLEALL_ELEMENT.click();
	}
	



}
