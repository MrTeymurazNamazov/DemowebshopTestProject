package Test01;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertEquals;

public class US202_QeydiyyatMenfi_RegisterNegative {

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

        WebElement registbtn1 = driver.findElement(By.ById.id("register-button"));
        registbtn1.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement emptyEmailTxt = driver.findElement(By.xpath("//span[@data-valmsg-for='Email']"));
        assertEquals(emptyEmailTxt.getText(), "Email is required.");
        MyFunc.wait(2);
        System.out.println("Email is required.");

        WebElement inputEmail = driver.findElement(By.ById.id("Email"));
        inputEmail.sendKeys("caps.team16@gmail.com");
        System.out.println("Email entered");

        WebElement inputPassword = driver.findElement(By.ById.id("Password"));
        inputPassword.sendKeys("pass1234");
        System.out.println("Password entered");

        registbtn1.click();
        MyFunc.wait(2);
        WebElement emptyPasswordtxt = driver.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']"));
        assertEquals("Password is required.", emptyPasswordtxt.getText(), "Password is required.");

        WebElement inputCPassword = driver.findElement(By.ById.id("ConfirmPassword"));
        inputCPassword.sendKeys("pass123");
        System.out.println("Wrong C.Password entered");
        MyFunc.wait(2);

        WebElement nomatchPasswordtxt = driver.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']"));
        assertEquals(nomatchPasswordtxt.getText(), "The password and confirmation password do not match.");
        System.out.println("The password and confirmation password do not match.");
        MyFunc.wait(2);

        inputCPassword.sendKeys("4");

        WebElement genderbtn = driver.findElement(By.ById.id("gender-male"));
        genderbtn.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");

        registbtn1.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement emailmesage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        wait.until(ExpectedConditions.visibilityOf(emailmesage));
        assertEquals("The specified email already exists", emailmesage.getText());
        System.out.println("Email already exists");
        MyFunc.wait(2);

        gozleBagla();
    }
}
