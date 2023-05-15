package TestNG;

import org.openqa.selenium.chrome.ChromeOptions;

import static org.example.DriverManager.driver;

public class check {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
} }
