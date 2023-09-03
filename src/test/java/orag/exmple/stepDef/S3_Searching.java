package orag.exmple.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class S3_Searching {
    @Given("User Navigate to the home page or any page where the search field is visible")
    public void NavigateHomePage (){

    }

    @And("User type a search word in the appropriate search field and click on the search icon")
    public void userTypeASearchWordInTheAppropriateSearchFieldAndClickOnTheSearchIcon() {
    }

    @And("The website returns some results")
    public void theWebsiteReturnsSomeResults() {
    }

    @And("The user click on advanced search and use it to narrow down the results")
    public void theUserClickOnAdvancedSearchAndUseItToNarrowDownTheResults() {
    }

    @Then("The final results should match the selected filter and search keywords")
    public void theFinalResultsShouldMatchTheSelectedFilterAndSearchKeywords() {
    }
}
