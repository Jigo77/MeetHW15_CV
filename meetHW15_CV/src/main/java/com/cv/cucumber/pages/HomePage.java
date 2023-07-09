package com.cv.cucumber.pages;

import com.cv.cucumber.browserfactory.ManageBrowser;
import com.cv.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    // By jotitle = By.xpath("//input[@id='keywords']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitle;
    //By location = By.xpath("//input[@id='location']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    // By moreop = By.xpath("//button[@id='toggle-hp-search']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreop;

    // By salaryMin = By.xpath("//div[@class='hps-sal-min']/input");
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-min']/input")
    WebElement salaryMin;
    // By salaryMax = By.xpath("//div[@class='hps-sal-max']/input");
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-max']/input")
    WebElement salaryMax;
    //By findJobsBtn = By.xpath("//input[@id='hp-search-btn']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobtitle, jobTitle);
    }

    public void enterLocation(String location1) {
        sendTextToElement(location, location1);
    }

    public void selectDistance(String distance) {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='distance']"));

        Select select = new Select(dropDown);
        select.selectByVisibleText(distance);

    }


    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreop);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='salarytype']"));

        Select select = new Select(dropDown1);
        select.selectByVisibleText(sType);
    }

    public void selectJobType(String jobType) {
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='tempperm']"));

        Select select = new Select(dropDown2);
        select.selectByVisibleText(jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }

}
