package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class usPDFinvoiceDwld {
    @Test
    public void test001() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-login']")));
        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginbtn.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement inputEmaillogin = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmaillogin.sendKeys("stefanorichy14@gmail.com");
        System.out.println("Email entered");

        WebElement loginbtn2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn2.click();
        MyFunc.wait(2);
        System.out.println("Login button pressed");

        WebElement unsuccessfulLogintxt = driver.findElement(By.xpath("//*[text()='Login was unsuccessful." +
                " Please correct the errors and try again.']"));
        assertEquals("Login was unsuccessful.", "Login was unsuccessful. Please correct the errors and try again.",
                unsuccessfulLogintxt.getText());
        System.out.println("Login was unsuccessful.");

        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
        inputPasswordlogin.sendKeys("kYT3aH4$YYQk9@");
        MyFunc.wait(2);
        System.out.println("Password entered");

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

        logingmailtxt.click();
        System.out.println("Login button pressed");

        WebElement orderbtn = driver.findElement(By.xpath("(//a[text()='Orders'])[1]"));
        orderbtn.click();
        MyFunc.wait(2);
        System.out.println("Order button pressed");

        WebElement myOrderstxt = driver.findElement(By.xpath(" //h1[text()='My account - Orders']"));
        wait.until(ExpectedConditions.visibilityOf(myOrderstxt));
        assertTrue(myOrderstxt.isDisplayed());
        System.out.println(myOrderstxt.getText());

        WebElement detailsbtn = driver.findElement(By.xpath("( //input[@class='button-2 order-details-button'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(detailsbtn));
        assertTrue(detailsbtn.isDisplayed());
        detailsbtn.click();
        System.out.println("Details btn is pressed");

        WebElement orderInformationtxt = driver.findElement(By.xpath("//h1[text()='Order information']"));
        wait.until(ExpectedConditions.visibilityOf(orderInformationtxt));
        assertTrue(orderInformationtxt.isDisplayed());
        System.out.println(orderInformationtxt.getText());

        WebElement paymantMethodtxt = driver.findElement(By.xpath("//li[@class='payment-method']"));
        assertEquals("Credit Card", paymantMethodtxt.getText());
        System.out.println(paymantMethodtxt.getText());

        WebElement laptoptxt = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]"));
        assertEquals("14.1-inch Laptop", laptoptxt.getText());
        System.out.println(laptoptxt.getText());

        WebElement pricetxt = driver.findElement(By.xpath("(//span[@class='nobr'])[8]"));
        assertEquals("1590.00", pricetxt.getText());
        System.out.println(pricetxt.getText());

        WebElement pdfInvoicebtn = driver.findElement(By.xpath("//a[text()='PDF Invoice']"));
        assertEquals("PDF Invoice", pdfInvoicebtn.getText());
        pdfInvoicebtn.click();
        System.out.println(pdfInvoicebtn.getText());

        gozleBagla();
    }
}
