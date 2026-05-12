package Test01;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertTrue;

public class US207_SorguSesverme_SurveyVoting {
    @Test
    public void test002() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-login']")));
        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginbtn.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement inputEmaillogin = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmaillogin.sendKeys("caps.team15@gmail.com");
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
        System.out.println("Login button3 pressed");

        WebElement logingmailtxt = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        wait.until(ExpectedConditions.elementToBeClickable(logingmailtxt));
        assertTrue(logingmailtxt.isDisplayed());
        System.out.println(logingmailtxt.getText());

        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement excelentbtn = driver.findElement(By.id("pollanswers-1"));
        wait.until(ExpectedConditions.elementToBeClickable(excelentbtn));
        excelentbtn.click();
        System.out.println("Excelent btn is pressed");

        WebElement votebtn = driver.findElement(By.xpath("//input[@class='button-2 vote-poll-button']"));
        votebtn.click();
        System.out.println("Vote btn is pressed");

        WebElement answer = driver.findElement(By.xpath("(//li[@class='answer'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(answer));
        assertTrue("Answer is unpressed", answer.isDisplayed());

        gozleBagla();


    }
}
