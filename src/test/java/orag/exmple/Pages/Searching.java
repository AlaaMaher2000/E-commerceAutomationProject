package orag.exmple.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searching {
    @FindBy(id = "small-searchterms")
    public  WebElement Searchfeild ;


//     @FindBy(id = "advs")
//     public WebElement  advancedSearch ;
     @FindBy(className = "button-1 search-box-button")
     public  WebElement Searchbutton;


     @FindBy(className = "add-to-cart-button-9")
     public WebElement addToCart ;
     @FindBy(className = "cart-label")
     public WebElement shoppingCart;
     @FindBy(className = "button-2 update-cart-button")
     public WebElement updateShoppingCart;
     @FindBy (id = "itemquantity11287")
     public WebElement Quantity ;
     @FindBy (id = "termsofservice")
     public WebElement termsofservice ;

     @FindBy (id = "checkout")
     public WebElement checkout;

     @FindBy(id = "giftcardcouponcode")
     public WebElement coupon ;


}
