package orag.exmple.stepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import orag.exmple.Pages.RegisterPage;
import orag.exmple.Pages.homePages;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class S1_register {
    Faker faker = new Faker();
    homePages home = new homePages();
    RegisterPage register = new RegisterPage();

    @And("user select register button")
    public void userSelectRegisterButton() {
        home.Register.click();
    }

    @And("user select gender type")
    public void userSelectGenderType() {
        register.gender.click();

    }

    @And("user enter first name automation and last name tester")
    public  void userEnterFirstNameAndLastName(  ) {

        register.FirstName.sendKeys(faker.name().firstName());
        register.LastName.sendKeys(faker.name().lastName());
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
    Select select = new Select(register.DateOfBirthDay);
    select.selectByValue("4");
    Select select1 = new Select(register.DateOfBirthMonth);
    select1.selectByValue("4");
    Select select2 = new Select(register.DateOfBirthYear);
    select2.selectByValue("1999");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        Faker fake = new Faker();
        String email = fake.internet().emailAddress();
        register.email.sendKeys(email);
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {
        String tempPassword =faker.internet().password();

        register.Password.sendKeys(tempPassword);
        register.ConfirmPassword.sendKeys(tempPassword);


    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registering.click();
    }
    @And("Check the news letter")
    public void checkTheNewsLetter() {
        if (register.Newsletter.isSelected() != true) {
            register.Newsletter.click();
        }

    }
    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(register.registrationComplete.getText(),"Your registration completed");
        soft.assertEquals(register.registrationComplete.getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();

    }
     }