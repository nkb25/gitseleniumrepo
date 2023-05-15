package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class w3school {
    public static void main(String[] args) throws Exception
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});


        WebDriver driver=new ChromeDriver(options);
         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(" Nitish");
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        driver.close();
    }
}

