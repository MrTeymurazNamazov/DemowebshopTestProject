package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.gozleBagla;
import static org.junit.Assert.assertEquals;

public class userStorylogin {
    @Test
    public void test002() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginbtn.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement inputEmaillogin = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmaillogin.sendKeys("stefanorichy15@gmail.com");
        System.out.println("Email entered");

        WebElement loginbtn2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn2.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement unsuccessfulLogintxt = driver.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        assertEquals("Login was unsuccessful.", "Login was unsuccessful. Please correct the errors and try again.", unsuccessfulLogintxt.getText());
        System.out.println("Login was unsuccessful.");

        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
        inputPasswordlogin.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("W.Password entered");
        MyFunc.wait(2);

        WebElement rememberMebtn = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        rememberMebtn.click();
        MyFunc.wait(2);
        System.out.println("Remember me button pressed");

        WebElement loginbtn3 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn3.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement logingmailtxt = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        assertEquals("Your registration completed", "stefanorichy15@gmail.com", logingmailtxt.getText());
        System.out.println(logingmailtxt.getText());

        gozleBagla();
    }
}
//        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
//        loginbtn.click();
//        MyFunc.wait(2);
//        System.out.println("Login button pressed");
//
//        WebElement inputEmaillogin = driver.findElement(By.xpath("////input[@id='Email']"));
//        inputEmaillogin.sendKeys("stefanorichy20@gmail.com");
//        System.out.println("Email entered");
//
//        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
//        inputPasswordlogin.sendKeys("kYT3aH4$YYQk9@");
//        System.out.println("Password entered");
//        MyFunc.wait(2);
//
//        WebElement rememberMebtn = driver.findElement(By.xpath("//input[@id='RememberMe']"));
//        rememberMebtn.click();
//        MyFunc.wait(2);
//        System.out.println("Remember me button pressed");
//
//        WebElement loginbtn2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
//        loginbtn2.click();
//        MyFunc.wait(2);
//        System.out.println("Login button pressed");