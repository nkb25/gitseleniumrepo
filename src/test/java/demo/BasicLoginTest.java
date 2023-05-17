package demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BasicLoginTest {

    WebDriver driver=DriverManager.getDriver();
    BasicLoginPage login;

    @BeforeTest
    void setup()
    {
        WebDriver driver=DriverManager.getDriver();
        login =new BasicLoginPage(driver);
    }

    @AfterTest

    void teardown() {
        //driver.quit();
    }
    @Test
    void testBasicLoginSuccess()
    {
        login.with("8628084430", "Sapehiya$000");
    } }
