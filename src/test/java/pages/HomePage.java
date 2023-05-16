package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
//pagefactory
	
	@FindBy(name="searchbar")
	WebElement srcbox;
	
	@FindBy(id="button-search")
	WebElement srcBtn;

	@FindBy(id="cart")
	WebElement cartBtn;	
	
	
	public HomePage() {
	PageFactory.initElements(driver,this);	
	}
	
	//ACTION
	//LOGIN
	//SIGNUP
			
	public void searchItem(String strItem) {
	srcbox.sendKeys(strItem);
	srcBtn.click();
	}
	
	//View Shopping Cart
}
