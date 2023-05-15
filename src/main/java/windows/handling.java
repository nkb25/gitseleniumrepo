package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handling {


    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(options);

        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/crm/");
        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary.salesforce-sans-regular[aria-label='Try for free']")).click();

        Thread.sleep(4000);
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);

        driver.switchTo().window(childwindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("nitish");
        driver.findElement(By.name("UserLastName")).sendKeys("bhardwaj");

        driver.switchTo().window(parentwindow);
    }
}
