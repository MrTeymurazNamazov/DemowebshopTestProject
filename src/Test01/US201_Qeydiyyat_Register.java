package Test01;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US201_Qeydiyyat_Register {
    @Test
    public void test001() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-register']")));
        WebElement registbtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registbtn.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement inputFirstName = driver.findElement(By.ById.id("FirstName"));
        inputFirstName.sendKeys("Team");
        System.out.println("First name entered");

        WebElement inputLastName = driver.findElement(By.ById.id("LastName"));
        inputLastName.sendKeys("twelve");
        System.out.println("Last name entered");



        WebElement inputEmail = driver.findElement(By.ById.id("Email"));
        inputEmail.sendKeys("caps.team16@gmail.com");
        System.out.println("Email entered");

        WebElement inputPassword = driver.findElement(By.ById.id("Password"));
        inputPassword.sendKeys("pass1234");
        System.out.println("Password entered");

        WebElement inputCPassword = driver.findElement(By.ById.id("ConfirmPassword"));
        inputCPassword.sendKeys("pass1234");
        System.out.println("Confirm Password entered");
        MyFunc.wait(2);

        WebElement genderbtn = driver.findElement(By.ById.id("gender-male"));
        genderbtn.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");

        WebElement registbtn1 = driver.findElement(By.ById.id("register-button"));
        registbtn1.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement registcompletedText = driver.findElement(By.ByClassName.className("result"));
        assertEquals("Your registration completed", registcompletedText.getText());
        System.out.println("Your registration completed");

        WebElement continuebtn = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
        continuebtn.click();
        MyFunc.wait(2);
        System.out.println("Continue button pressed");

        WebElement logingmailtxt = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(logingmailtxt));
        assertTrue(logingmailtxt.isDisplayed());
        System.out.println(logingmailtxt.getText());

        gozleBagla();
    }

}
