package orag.exmple.stepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orag.exmple.Pages.Searching;

public class S4_addingTocCart {
    Searching Searching = new Searching();
    Faker faker = new Faker();

    @Given("User have a list of products from search results or from navigating list of products in home page")
    public void userHaveAListOfProductsFromSearchResultsOrFromNavigatingListOfProductsInHomePage() {
        Searching.Searchfeild.sendKeys("laptop");
        Searching.Searchbutton.click();
    }



    @And("User add the product to the shopping cart")
    public void userAddTheProductToTheShoppingCart() {
        Searching.addToCart.click();
    }

    @And("User can navigate to the shopping cart to confirm that the product is added")
    public void userCanNavigateToTheShoppingCartToConfirmThatTheProductIsAdded() {
        Searching.shoppingCart.click();
    }



    @Then("User can update the quantity from the shopping cart")
    public void userCanUpdateTheQuantityFromTheShoppingCart() {
        Searching.updateShoppingCart.click();
        Searching.Quantity.sendKeys("3");
        Searching.coupon.sendKeys("025535418");
        Searching.termsofservice.click();
        Searching.checkout.click();
    }
}
