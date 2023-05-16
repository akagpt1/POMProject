package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.searchResultPage;

public class PlaceOrderTest extends TestBase {
HomePage homePage;
searchResultPage resultPage;
  @BeforeTest
  public void setup() {
	  initialize();
  }
  
  @Test 
  public void addItemTest() {
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
	  resultPage = new searchResultPage();
	  resultPage.viewItemDetails();
	  resultPage.addToCart();
	   
  }
}
