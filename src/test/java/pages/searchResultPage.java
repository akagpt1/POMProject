package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class searchResultPage extends TestBase {
	@FindBy(css = "li.preview")
	WebElement itemIcon;
	
	@FindBy(css = "div.detail.call-to-action")
	WebElement addBtn;
	
	public searchResultPage() {
		PageFactory.initElements(driver,this);
	}
	
	

//viewDetails
	
	public void viewItemDetails() {
		itemIcon.click();
		
	}



	public void addToCart() {
		addBtn.click();
		// TODO Auto-generated method stub
		
	}
	
	
}
