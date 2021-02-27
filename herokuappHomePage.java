package Selenium.pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class herokuappHomePage {

    public herokuappHomePage(WebDriver driver){
        PageFactory.initElements(driver,this); // initializing all the elements we have locates under this class

    }

    @FindBy(linkText = "A/B Testing")
    WebElement abTesting;

    @FindBy(xpath = "//a[@href='challenging_dom']")
    WebElement challengingDomLink;

    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdownLink;








}