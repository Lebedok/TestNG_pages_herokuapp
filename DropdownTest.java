package Selenium.pages.herokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest {
    WebDriver driver;
    Selenium.pages.herokuapp.herokuappHomePage herokuappHomePage;
    Selenium.pages.herokuapp.dropDownPage dropDownPage;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        herokuappHomePage = new herokuappHomePage(driver);
        dropDownPage = new dropDownPage(driver);


    }

    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/");
        herokuappHomePage.dropdownLink.click();
        String header = dropDownPage.dropDownPageHeader.getText();
        Assert.assertEquals("Dropdown List", header);

    }
}
