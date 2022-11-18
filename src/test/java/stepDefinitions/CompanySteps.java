package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class CompanySteps {

    @When("user enters the username and password and clicks on login button")
    public void login(){

        System.out.println("I am in login method and performing login.");

    }

    @Given("user launches the application")
    public void launchApplication(){

        System.out.println("I am in launch application and launching the browser");
    }

    @Then("user login is successful")
    public void verifyLogin(){
        System.out.println("I am in verify login and login is successful.");
    }


    @And("user enters company data")
    public void enterCompanyInfo(){
        System.out.println("Entering the company data.");
    }

    @And("user navigates to company page")
    public void navigateToCompanyPage(){

    }

    @And("user saves the company")
    public void saveTheCompany(){

    }

    @Then("company created successfully.")
    public void verifyCompanyCreation(){

    }

    @When("user opens the company form")
    public void openCompanyForm(){
        System.out.println("User is navigated to company form.");
    }


    @Then("application throws the error")
    public void validateApplicationError(){
        System.out.println("Application has thrown the error.");
    }

    @Given("this is sample given")
    public void sample1(){
        System.out.println("this is sample given");
    }

    @When("sample when")
    public void sample2(){
        System.out.println("sample when");
    }

    @Then("^sample then$")
    public void sample3(){
        System.out.println("sample then");
    }

    @Given("^user launches \"(.*.)\" browser and user navigates to \"(.*.)\"$")
    public void sampleStepWithVals(String val1, String val2){
        System.out.println("I am in sample step with regular expression. given values are " + val1 + "----------" + val2);
    }

    @When("user enter contact info")
    public void enterContactInfo(Map<String,String> info){

        System.out.println("contact name : " + info.get("contactName"));
        System.out.println("contact type : " + info.get("type"));
        System.out.println("contact email : " + info.get("email"));
    }

}
