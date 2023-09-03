package orag.exmple.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static orag.exmple.stepDef.Hooks.driver;

public class RegisterPage extends pageBase {
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "gender-male")
    public WebElement gender;
    @FindBy(id = "FirstName")
    public WebElement FirstName;
    @FindBy(id = "LastName")
    public WebElement LastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement DateOfBirthDay;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement DateOfBirthMonth;
    @FindBy(name = "DateOfBirthYear")
    public WebElement DateOfBirthYear;
    @FindBy(id= "Email")
    public WebElement email;
    @FindBy(id ="Password")
    public WebElement Password;
    @FindBy(name = "ConfirmPassword")
    public WebElement ConfirmPassword;
    @FindBy(id = "register-button")
    public WebElement registering;
    @FindBy(name = "Newsletter")
    public WebElement Newsletter;

    @FindBy( className = "result")
    public WebElement registrationComplete;












}
