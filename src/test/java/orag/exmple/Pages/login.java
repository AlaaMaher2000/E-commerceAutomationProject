package orag.exmple.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
       @FindBy ( id = "Email")
        public static WebElement emailBox ;
       @FindBy (name = "password")
       public static WebElement passwordBox ;
       @FindBy (name = "RememberMe")
       public static WebElement RememberMe;
       @FindBy(className = "button-1 login-button")
       public static WebElement LOGIN ;

    }


