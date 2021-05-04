package stepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieYesSteps {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open CookieYes home page")
    public void i_open_cookie_yes_home_page() {
        driver.navigate().to("https://www.cookieyes.com/");
    }

    @Then("I verify the logo present on page")
    public void i_verify_the_logo_present_on_page() {
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/header/nav/div/a/img")).isDisplayed());
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
