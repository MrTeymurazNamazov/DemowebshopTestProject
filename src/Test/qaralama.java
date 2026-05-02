package Test;

import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.gozleBagla;

public class qaralama {
    @Test
    public void test001() {
        driver.navigate().to("https://demowebshop.tricentis.com/");

        WebElement registbtn = driver.findElement(By.ByClassName.className("ico-register"));
        registbtn.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement inputFirstName = driver.findElement(By.ById.id("FirstName")  );
        inputFirstName.sendKeys("Stefano");
        System.out.println("First name entered");

        WebElement inputLastName = driver.findElement(By.ById.id("LastName"));
        inputLastName.sendKeys("Richy");
        System.out.println("Last name entered");

        WebElement inputEmail = driver.findElement(By.ById.id("Email"));
        inputEmail.sendKeys("stefanorichy1@gmail.com");
        System.out.println("Email entered");

        WebElement inputPassword = driver.findElement(By.ById.id("Password"));
        inputPassword.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("Password entered");

        WebElement inputCPassword = driver.findElement(By.ById.id("ConfirmPassword"));
        inputCPassword.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("C.Password entered");
        MyFunc.wait(2);

        WebElement genderbtn = driver.findElement(By.ById.id("gender-male"));
        genderbtn.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");

        WebElement registbtn2 = driver.findElement(By.ById.id("register-button"));
        registbtn2.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement registcompletedText = driver.findElement(By.className("result"));
        Assert.assertEquals("Your registration completed", registcompletedText.getText());

        WebElement continuebtn = driver.findElement(By.ByClassName.className("button-1 register-continue-button"));
        continuebtn.click();
        MyFunc.wait(2);
        System.out.println("Continue button pressed");

        WebElement inputFirstName2 = driver.findElement(By.ById.id("FirstName")  );
        inputFirstName2.sendKeys("Stefano");
        System.out.println("First name entered");

        WebElement inputLastName2 = driver.findElement(By.ById.id("LastName"));
        inputLastName2.sendKeys("Richy");
        System.out.println("Last name entered");

        WebElement inputEmail2 = driver.findElement(By.ById.id("Email"));
        inputEmail2.sendKeys("stefanorichy1@gmail.com");
        System.out.println("Email entered");

        WebElement inputPassword2 = driver.findElement(By.ById.id("Password"));
        inputPassword2.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("Password entered");

        WebElement inputCPassword2 = driver.findElement(By.ById.id("ConfirmPassword"));
        inputCPassword2.sendKeys("kYT3aH4$YYQk9@");
        System.out.println("C.Password entered");
        MyFunc.wait(2);

        WebElement genderbtn2 = driver.findElement(By.ById.id("gender-male"));
        genderbtn2.click();
        MyFunc.wait(2);
        System.out.println("Gender button pressed");

        WebElement registbtn3 = driver.findElement(By.ById.id("register-button"));
        registbtn3.click();
        MyFunc.wait(2);
        System.out.println("Register button pressed");

        WebElement text = driver.findElement(By.className("validation-summary-errors"));
        Assert.assertEquals("The specified email already exists", text.getText());
        System.out.println("Email already exists");
        MyFunc.wait(2);







        gozleBagla();
    }
}
