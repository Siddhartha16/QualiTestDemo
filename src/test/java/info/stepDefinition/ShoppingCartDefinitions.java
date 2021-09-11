package info.stepDefinition;

import java.util.List;

import info.steps.ShoppingCartSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartDefinitions {

ShoppingCartSteps objShoppingCartSteps;
	
	@Given("I add four different products to my wish list")
	public void I_add_four_different_products_to_my_wish_list() {
		objShoppingCartSteps.getUrl();
		objShoppingCartSteps.addItemsToWishlist();
		

	}

	@When("I view my wishlist table")
	public void I_view_my_wishlist_table() {
		objShoppingCartSteps.navigateToWishList();
				
	}

	@Then("I find total four selected items in my wishlist")
	public void I_find_total_four_selected_items_in_my_wishlist() {
	
		objShoppingCartSteps.addItemsToCart();
	}

	@When("I search for lowest price product")
	public void I_search_for_lowest_price_product() throws InterruptedException {
		objShoppingCartSteps.selectLowestPriceFromCart();
	}

	@And("I am able to add the lowest price item to my cart")
	public void I_am_able_to_add_the_lowest_price_item_to_my_cart() {
		objShoppingCartSteps.navigateToCartPage();
	}

	@Then("I am able to verify the item in my cart")
	public void I_am_able_to_verify_the_item_in_my_cart() {
		objShoppingCartSteps.closeBrowser();
	   
	}
}
