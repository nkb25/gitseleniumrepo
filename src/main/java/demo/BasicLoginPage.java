package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicLoginPage {

    WebDriver driver=DriverManager.getDriver();
    By usernameInput = By.cssSelector("input#email.inputtext._55r1._1kbt");
    By passwordInput= By.cssSelector("input#pass.inputtext._55r1._9npi");
    By submitButton = By.cssSelector("button#loginbutton, button[name='login");

    public BasicLoginPage(WebDriver driver)
    {
//https://bonigarcia.dev/selenium-webdriver-java/login-form.html


        driver.get( "https://www.facebook.com/login/");
    }
    public void with(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    public Object successBoxPresent() {
        // TODO Auto-generated method stub
        return null;
    }
}

