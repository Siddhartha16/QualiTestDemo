package info.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.reusables.reusable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	//reusable objReusable = new reusable();
	
	WebDriver driver = null;
		
	@FindBy(xpath="//h2[text()='Black pants']/following::span[text()='Add to wishlist'][1]")
	protected WebElementFacade btnAddtoWishList;
	
	@FindBy(xpath="//span[@class='price']//ins")
	protected List<WebElementFacade> listProducts;
		
	

}