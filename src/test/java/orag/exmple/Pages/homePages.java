package orag.exmple.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static orag.exmple.stepDef.Hooks.driver;




public class homePages {
//    public WebElement registerTab (){
//        return driver.findElement(By.className("ico-register"));
//    }
     public homePages(){
            PageFactory.initElements(driver,this);
     }
     @FindBy(className = "ico-register")
    public WebElement Register ;
     @FindBy(className = "#4cb17c")
    public static WebElement login;




}
