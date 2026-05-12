package Test01;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertTrue;

public class US203_Chixish_Logout {
    @Test
    public void test001() {

        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-login']")));
        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginbtn.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement inputEmaillogin = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmaillogin.sendKeys("caps.team16@gmail.com");
        System.out.println("Email entered");

        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
        inputPasswordlogin.sendKeys("pass1234");
        System.out.println("Password entered");
        MyFunc.wait(2);

        WebElement rememberMebtn = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        rememberMebtn.click();
        MyFunc.wait(2);
        System.out.println("Remember me button pressed");

        WebElement loginbtn3 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn3.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement logingmailtxt = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(logingmailtxt));
        assertTrue(logingmailtxt.isDisplayed());
        System.out.println(logingmailtxt.getText());

        WebElement logoutbtn = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logoutbtn.click();
        MyFunc.wait(2);
        System.out.println("Logout button pressed");

        WebElement loginbtn2 = driver.findElement(By.xpath("//a[@class='ico-login']"));
        assertTrue(loginbtn2.isEnabled());
        System.out.println("loginbtn2 is asserted");

        gozleBagla();
    }
}
