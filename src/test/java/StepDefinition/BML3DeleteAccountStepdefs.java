package StepDefinition;

import POM.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.BML1AddAccountStepDefinition.driver;


public class BML3DeleteAccountStepdefs {
    Elements elements;

    @Given("manager in customers page")
    public void managerInCustomersPage() {
        elements = new Elements(driver);
        elements.managerInCustomersPage();
    }

    @When("manager search name")
    public void managerSearchName() {
        elements.managerSearchName();
    }

    @And("manager delete the account")
    public void managerDeleteTheAccount() {
        elements.managerDeleteTheAccount();
        
    }

    @Then("successfully account will be deleted")
    public void successfullyAccountWillBeDeleted() {
        elements.successfullyAccountWillBeDeleted();
    }
}
