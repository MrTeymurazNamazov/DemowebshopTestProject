package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class usPaymentInformation {
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

        WebElement unsuccessfulLogintxt = driver.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        assertEquals("Login was unsuccessful.", "Login was unsuccessful. Please correct the errors and try again.", unsuccessfulLogintxt.getText());
        System.out.println("Login was unsuccessful.");

        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
        inputPasswordlogin.sendKeys("kYT3aH4$YYQk9@");
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

        WebElement logingmailtxt = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        wait.until(ExpectedConditions.elementToBeClickable(logingmailtxt));
        assertTrue(logingmailtxt.isDisplayed());
        System.out.println(logingmailtxt.getText());

        WebElement computersbtn = driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(computersbtn));
        computersbtn.click();
        MyFunc.wait(2);
        System.out.println("Computers button pressed");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Show products in category Notebooks'])[1]")));
        assertEquals("https://demowebshop.tricentis.com/computers", driver.getCurrentUrl());

        WebElement notebookbtn = driver.findElement(By.xpath("(//a[@title='Show products in category Notebooks'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(notebookbtn));
        notebookbtn.click();
        MyFunc.wait(2);
        System.out.println("Notebooks button pressed");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//Input[@class='button-2 product-box-add-to-cart-button']")));
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
        MyFunc.wait(2);

        WebElement termstxt = driver.findElement(By.xpath("//*[text()='Please accept the terms of service before the next step.']"));
        assertTrue(termstxt.isDisplayed());
        MyFunc.wait(2);

        WebElement termssmsclosebtn = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']"));
        termssmsclosebtn.click();
        MyFunc.wait(2);
        System.out.println("Terms of Service button pressed");

        WebElement termsofservicebtn = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        termsofservicebtn.click();
        MyFunc.wait(2);
        System.out.println("Terms of Service button pressed");

        WebElement checkoutbtn2 = driver.findElement(By.xpath("//button[@class='button-1 checkout-button']"));
        checkoutbtn2.click();
        System.out.println("checkout btn pressed");

        WebElement continuebtn = driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(continuebtn));

        WebElement billingAddressSelect = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select billingAddress = new Select(billingAddressSelect);
        billingAddress.selectByValue("1");
        MyFunc.wait(2);
        System.out.println("Billing Address Selected");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='BillingNewAddress.StateProvinceId']")));
        assertEquals("https://demowebshop.tricentis.com/onepagecheckout", driver.getCurrentUrl());


        WebElement StateProvinceSelector = driver.findElement(By.xpath("//select[@name='BillingNewAddress.StateProvinceId']"));
        Select select1 = new Select(StateProvinceSelector);
        select1.selectByValue("12");
        MyFunc.wait(2);
        System.out.println("State Province Selected to billing");

        continuebtn.click();
        WebElement cityIsRequiredtxt = driver.findElement(By.xpath("//span[text()='City is required']"));
        assertTrue(cityIsRequiredtxt.isDisplayed());

        WebElement streetAddressIsRequired = driver.findElement(By.xpath("//span[text()='Street address is required']"));
        assertTrue(streetAddressIsRequired.isDisplayed());

        WebElement cityAddress = driver.findElement(By.id("BillingNewAddress_City"));
        cityAddress.sendKeys("wilmington");

        WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("16 Germay Drive ");

        WebElement address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
        address2.sendKeys("Unit E / ST421647");

        WebElement ZipPostalCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        ZipPostalCode.sendKeys("19804");
        System.out.println("Zip Postal Code entered");

        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("+13022506811");
        System.out.println("Phone Number entered");

        WebElement faxNumber = driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        faxNumber.sendKeys("+13022506811");
        System.out.println("Fax Number entered");

        WebElement companyName = driver.findElement(By.id("BillingNewAddress_Company"));
        companyName.sendKeys("Starex");
        System.out.println("Company Name entered");
        continuebtn.click();
        MyFunc.wait(2);
        System.out.println("Continue button pressed");

        WebElement pickUpInStorebtn = driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        wait.until(ExpectedConditions.elementToBeClickable(pickUpInStorebtn));
        assertEquals("https://demowebshop.tricentis.com/onepagecheckout", driver.getCurrentUrl());
        pickUpInStorebtn.click();
        MyFunc.wait(2);
        System.out.println("Pick up In Store button pressed");

        WebElement shippingAddresstxt = driver.findElement(By.xpath("//*[text()='Shipping address']"));
        assertTrue("Shipping address", shippingAddresstxt.isDisplayed());

        WebElement continuebtn1 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        continuebtn1.click();
        MyFunc.wait(2);
        System.out.println("Continue button pressed");

        WebElement paymentMethodtxt = driver.findElement(By.xpath("//h2[text()='Payment method']"));
        wait.until(ExpectedConditions.visibilityOf(paymentMethodtxt));
        assertTrue(paymentMethodtxt.isDisplayed());
        System.out.println("Payment method is displayed");

        WebElement creditCardbtn = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        creditCardbtn.click();
        System.out.println("Credit card btn pressed");

        WebElement continuebtn2 = driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        continuebtn2.click();
        MyFunc.wait(2);
        System.out.println("Continue button2 pressed");

        WebElement paymentInformation = driver.findElement(By.xpath("//h2[text()='Payment information']"));
        wait.until(ExpectedConditions.visibilityOf(paymentInformation));
        assertTrue(paymentInformation.isDisplayed());
        System.out.println("Payment Information is displayed");

        WebElement cardholderName = driver.findElement(By.xpath("//input[@id='CardholderName']"));
        cardholderName.sendKeys("Stefano Richy");
        System.out.println("Cardholder name entered");

        WebElement cardNumber = driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4242 4242 4242 4242");
        System.out.println("Card number entered");

        WebElement expiryMonth = driver.findElement(By.id("ExpireYear"));
        Select month = new Select(expiryMonth);
        month.selectByValue("2032");
        MyFunc.wait(2);
        System.out.println("Month selected entered");

        WebElement cardCode = driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");
        System.out.println("Card code entered");
        MyFunc.wait(2);

        WebElement continuebtn3 = driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        continuebtn3.click();
        MyFunc.wait(2);
        System.out.println("Continue button3 pressed");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Confirm order']")));
        WebElement confirmOrder = driver.findElement(By.xpath("//h2[text()='Confirm order']"));
        assertTrue(confirmOrder.isDisplayed());
        assertEquals("https://demowebshop.tricentis.com/onepagecheckout", driver.getCurrentUrl());

        gozleBagla();
    }

}
