package orag.exmple.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orag.exmple.Pages.RegisterPage;
import orag.exmple.Pages.homePages;
import  orag.exmple.Pages.login;



public class S2_Login {
    @Given ("user go to login page")
    public void OpenLoginPage(){
        homePages home = new homePages();
        RegisterPage register = new RegisterPage();
        homePages.login.click();
    }

    @And("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {
        login.emailBox.sendKeys("Alaa");
        login.passwordBox.sendKeys("alaa");
        login.RememberMe.click();
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
       login.LOGIN.click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        login.emailBox.sendKeys("Alaa");
        login.passwordBox.sendKeys("alaa");
        login.RememberMe.click();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
    }
}
