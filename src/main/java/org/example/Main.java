package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;






public class Main {
    public static void main(String[] args) {
       ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
       options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(options);
       driver.manage().window().maximize();

       By emailBy= By.cssSelector("input#email.inputtext._55r1._1kbt");
        By passwordBy= By.cssSelector("input#pass.inputtext._55r1._9npi");
        By startbutton= By.cssSelector("button#loginbutton, button[name='login']");


        System.out.println(driver.getTitle());
        driver.get("https://www.facebook.com/login/");

//Filling the details in Email and password plus clicking checkbox
        WebElement loginElement=driver.findElement(emailBy);
        System.out.println("Enter the email here");
        loginElement.sendKeys("8628084430");

        WebElement passwordElement=driver.findElement(passwordBy);

        System.out.println("Enter the password here");
        passwordElement.sendKeys("Sapehiya$000");

       WebElement startBtn=driver.findElement(startbutton);
        startBtn.click();
        System.out.println(driver.getCurrentUrl());



        //WebElement resetElement=driver.findElement(resetemail);
        //resetElement.clear();
        //System.out.println("Provide Email");
        //resetElement.sendKeys("nkb25200@gmail.com");
        //driver.quit();
// TODO Auto-generated method stub
     /*   By startbutton= By.cssSelector("div.hero-content-5 a[href=\"/course/\"]");
        //   By joinUsBy= By.cssSelector("ul.main-menu a[href='/teachers/join-us/']");
        By joinUsBy= By.cssSelector("div.header-menu ul a[href=\"/teachers/join-us/\"]");
        By emailBy= By.cssSelector("div.form-alert-input input[id='id_login']");
        By passwordBy= By.cssSelector("div.form-alert-input input[name='password']");
        By checkboxBy= By.cssSelector("div.form-check input[id='id_remember']");
        By forgetpasswordBy=By.cssSelector("div.d-flex a[href='/accounts/password/reset/']");
        By resetemail= By.cssSelector("div.form-group input[id='id_email']");


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--load-extension=...\\adblock");

        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://mycbseguide.com/");
        System.out.println(driver.getTitle());

        //clicking on StartNow Button
        WebElement startBtn=driver.findElement(startbutton);
        startBtn.click();
        System.out.println(driver.getCurrentUrl());

        //clicking on join us button
        WebElement joinUsElement= driver.findElement(joinUsBy);
        joinUsElement.click();
        System.out.println(driver.getCurrentUrl());

        //Filling the details in Email and password plus clicking checkbox
        WebElement loginElement=driver.findElement(emailBy);
        loginElement.clear();
        System.out.println("Enter the email here");
        loginElement.sendKeys("nkb25200@gmail.com");

        WebElement passwordElement=driver.findElement(passwordBy);
        passwordElement.clear();
        System.out.println("Enter the password here");
        passwordElement.sendKeys("123456789");

        WebElement checkBox=driver.findElement(checkboxBy);
        checkBox.click();

        //Uncheck the Checkbox and clear login email and password.
        loginElement.clear();
        passwordElement.clear();
        checkBox.click();

        //navigate to forgot password.
        WebElement forgotElement=driver.findElement(forgetpasswordBy);
        forgotElement.click();

        //Fill in ResetEmail.
        WebElement resetElement=driver.findElement(resetemail);
        resetElement.clear();
        System.out.println("Provide Email");
        resetElement.sendKeys("nkb25200@gmail.com");

        resetElement.clear();

        System.out.println("Khatam tata bye");*/


} }


