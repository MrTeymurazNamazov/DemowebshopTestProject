package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class userStoryRegistration {
    @Test
    public void test001() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-register']")));
        WebElement registbtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registbtn.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement inputFirstName = driver.findElement(By.ById.id("FirstName"));
        inputFirstName.sendKeys("Stefano");
        System.out.println("First name entered");

        WebElement inputLastName = driver.findElement(By.ById.id("LastName"));
        inputLastName.sendKeys("Richy");
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
        inputEmail.sendKeys("stefanorichy25@gmail.com");
        System.out.println("Email entered");

        WebElement inputPassword = driver.findElement(By.ById.id("Password"));
        inputPassword.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("Password entered");

        registbtn1.click();
        MyFunc.wait(2);
        WebElement emptyPasswordtxt = driver.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']"));
        assertEquals("Password is required.", emptyPasswordtxt.getText(), "Password is required.");

        WebElement inputCPassword = driver.findElement(By.ById.id("ConfirmPassword"));
        inputCPassword.sendKeys("kYT3aH4$YYQk9");
        System.out.println("Wrong C.Password entered");
        MyFunc.wait(2);

        WebElement nomatchPasswordtxt = driver.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']"));
        assertEquals(nomatchPasswordtxt.getText(), "The password and confirmation password do not match.");
        System.out.println("The password and confirmation password do not match.");
        MyFunc.wait(2);

        inputCPassword.sendKeys("@");

        WebElement genderbtn = driver.findElement(By.ById.id("gender-male"));
        genderbtn.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");

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

        WebElement logout = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logout.click();
        MyFunc.wait(2);
        System.out.println("Logout button pressed");

        WebElement registrbtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registrbtn.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement inputfirstname = driver.findElement(By.ById.id("FirstName"));
        inputfirstname.sendKeys("Stefano");
        System.out.println("First name entered");

        WebElement inputlastname = driver.findElement(By.ById.id("LastName"));
        inputlastname.sendKeys("Richy1");
        System.out.println("Last name entered");


        WebElement inputemail = driver.findElement(By.ById.id("Email"));
        inputemail.sendKeys("stefanorichy25@gmail.com");
        System.out.println("Email entered");

        WebElement inputpassword = driver.findElement(By.ById.id("Password"));
        inputpassword.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("Password entered");

        WebElement inputcpassword = driver.findElement(By.ById.id("ConfirmPassword"));
        inputcpassword.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("C.Password entered");
        MyFunc.wait(2);

        WebElement genderbtn2 = driver.findElement(By.ById.id("gender-male"));
        genderbtn2.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");


        WebElement registrbtn3 = driver.findElement(By.xpath("//input[@id='register-button']"));
        registrbtn3.click();
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
