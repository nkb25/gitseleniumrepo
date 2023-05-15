package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class progrma {
    public static void main(String[] args) throws Exception
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

//simple alert
/*
driver.findElement(By.id("alertBox")).click();
Alert simpleAlert = driver.switchTo().alert();
System.out.println(simpleAlert.getText());
Thread.sleep(2000);
simpleAlert.accept();
Thread.sleep(2000);
driver.quit(); */


//confirmation alert
        driver.findElement(By.id("confirmBox")).click();
       // driver.findElement(By.cssSelector("button.btn.btn-primary[onclick='confirmbox()']")).click();
        Alert confirmationAlert= driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        Thread.sleep(2000); confirmationAlert.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.id("demo")).getText();
        driver.quit();
    }
}
