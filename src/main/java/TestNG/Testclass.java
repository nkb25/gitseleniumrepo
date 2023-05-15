package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Testclass {


    public void testscript() {
        ChromeOptions options=new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
         driver.quit();

    }
}
