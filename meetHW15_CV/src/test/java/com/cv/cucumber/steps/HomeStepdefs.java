package com.cv.cucumber.steps;

import com.cv.cucumber.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I enter jobTitle \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobtitle)  {
        new HomePage().enterJobTitle(jobtitle);

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^I select miles \"([^\"]*)\"$")
    public void iSelectMiles(String dis)  {
        new HomePage().selectDistance(dis);
    }

    @And("^I enter min salary \"([^\"]*)\"$")
    public void iEnterMinSalary(String min)  {
        new HomePage().enterMinSalary(min);
    }

    @And("^I enter max salrry \"([^\"]*)\"$")
    public void iEnterMaxSalrry(String max)  {
        new HomePage().enterMaxSalary(max);
    }

    @And("^I enter salary type \"([^\"]*)\"$")
    public void iEnterSalaryType(String saltype)  {
        new HomePage().selectSalaryType(saltype);
    }

    @And("^I enter jobtype \"([^\"]*)\"$")
    public void iEnterJobtype(String jobtype)  {
        new HomePage().selectJobType(jobtype);
    }

    @Then("^I should get job details$")
    public void iShouldGetJobDetails() {

    }

    @And("^I click on link$")
    public void iClickOnLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I click on Find button$")
    public void iClickOnFindButton() {
        new HomePage().clickOnFindJobsButton();
    }
}
