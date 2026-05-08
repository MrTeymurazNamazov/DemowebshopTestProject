package Test;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class userStoryOrdering extends BaseDriver {

    @Test
    public void test001() {

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

        WebElement computersbtn = driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(computersbtn));
        computersbtn.click();
        MyFunc.wait(2);
        System.out.println("Computers button pressed");
        assertEquals("https://demowebshop.tricentis.com/computers", driver.getCurrentUrl());

        WebElement notebookbtn = driver.findElement(By.xpath("(//a[@title='Show products in category Notebooks'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(notebookbtn));
        notebookbtn.click();
        MyFunc.wait(2);
        System.out.println("Notebooks button pressed");
        assertEquals("https://demowebshop.tricentis.com/notebooks", driver.getCurrentUrl());

        WebElement adToCartbtn = driver.findElement(By.xpath("//Input[@class='button-2 product-box-add-to-cart-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(adToCartbtn));
        adToCartbtn.click();
        MyFunc.wait(2);
        System.out.println("Ad To Cart button pressed");

        WebElement notificationBar = driver.findElement(By.xpath("//div[@id='bar-notification']"));
        wait.until(ExpectedConditions.visibilityOf(notificationBar));
        assertTrue(notificationBar.isDisplayed());

        WebElement shopingCartbtn = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        shopingCartbtn.click();
        MyFunc.wait(2);
        System.out.println("Shopping cart button pressed");

        WebElement checkoutbtn = driver.findElement(By.id("checkout"));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutbtn));

        WebElement notebookName = driver.findElement(By.xpath("//a[@class='product-name']"));
        assertEquals("14.1-inch Laptop", notebookName.getText());

        WebElement pricetxt = driver.findElement(By.xpath("//span[@class='product-unit-price']"));
        assertEquals("1590.00", pricetxt.getText());

        WebElement countrySelector = driver.findElement(By.id("CountryId"));
        Select javaSelect = new Select(countrySelector);
        javaSelect.selectByValue("1");
        MyFunc.wait(2);
        System.out.println("Country Selected");

        WebElement stateProvinceSelector = driver.findElement(By.id("StateProvinceId"));
        Select stateProvince = new Select(stateProvinceSelector);
        stateProvince.selectByValue("12");
        MyFunc.wait(2);
        System.out.println("State Province Selected");

        WebElement zipPostalCode = driver.findElement(By.id("ZipPostalCode"));
        zipPostalCode.sendKeys("19804");
        MyFunc.wait(2);
        System.out.println("Zip Postal Code entered");

        WebElement estimateShipping = driver.findElement(By.xpath("//input[@class='button-2 estimate-shipping-button']"));
        estimateShipping.click();
        MyFunc.wait(2);
        System.out.println("Estimate Shipping button pressed");

        WebElement groundtxt = driver.findElement(By.className("option-name"));
        System.out.println(groundtxt.getText());
        assertEquals("Ground (0.00)", groundtxt.getText());

        WebElement checkoutbtn1 = driver.findElement(By.id("checkout"));
        checkoutbtn1.click();

        WebElement termstxt = driver.findElement(By.xpath("//*[text()='Please accept the terms of service before the next step.']"));
        assertTrue(termstxt.isDisplayed());
        WebElement termssmsclosebtn = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']"));
        termssmsclosebtn.click();
        MyFunc.wait(2);
        System.out.println("Terms of Service button pressed");

        WebElement termsofservicebtn = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        termsofservicebtn.click();
        MyFunc.wait(2);
        System.out.println("Terms of Service button pressed");

        WebElement checkoutbtn2 = driver.findElement(By.id("checkout"));
        checkoutbtn2.click();

        WebElement continuebtn = driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(continuebtn));
        assertEquals("https://demowebshop.tricentis.com/onepagecheckout", driver.getCurrentUrl());

        WebElement countryselector = driver.findElement(By.xpath("//select[@name='BillingNewAddress.CountryId']"));
        wait.until(ExpectedConditions.elementToBeSelected(countryselector));

        gozleBagla();
    }
}
