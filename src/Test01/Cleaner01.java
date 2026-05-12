package Test01;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertTrue;

public class Cleaner01 {
    @Test
    public void test001() {

        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-login']")));
        WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginbtn.click();
        System.out.println("Login button pressed");

        WebElement inputEmaillogin = driver.findElement(By.xpath("//input[@id='Email']"));
        inputEmaillogin.sendKeys("caps.team16@gmail.com");
        System.out.println("Email entered");

        WebElement inputPasswordlogin = driver.findElement(By.xpath("//input[@id='Password']"));
        inputPasswordlogin.sendKeys("pass1234");
        System.out.println("Password entered");

        WebElement rememberMebtn = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        rememberMebtn.click();
        System.out.println("Remember me button pressed");

        WebElement loginbtn3 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn3.click();
        System.out.println("Login button pressed");

        WebElement logingmailtxt = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='account']"));
        wait.until(ExpectedConditions.elementToBeClickable(logingmailtxt));
        assertTrue(logingmailtxt.isDisplayed());
        System.out.println(logingmailtxt.getText());

        WebElement shopingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shopingcart.click();
        System.out.println("Shopping cart button pressed");

        List<WebElement> removeCheckboxes = driver.findElements(By.xpath("//input[@name='removefromcart']"));

        if (!removeCheckboxes.isEmpty()) {
            System.out.println("Корзина не пуста, очищаю...");

            removeCheckboxes.get(0).click();

            WebElement updateCartbtn = driver.findElement(By.xpath("//input[@name='updatecart']"));
            updateCartbtn.click();

            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.xpath("//div[@class='order-summary-content']"),
                    "Your Shopping Cart is empty"
            ));
        }
        System.out.println("Корзина пуста.");

        WebElement accountSettings = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='account'])[1]")));
        accountSettings.click();

        WebElement addressesbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Addresses'])[1]")));
        addressesbtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='My account - Addresses']")));
        System.out.println("Страница адресов загружена.");

        List<WebElement> deleteButtons = driver.findElements(By.xpath("//input[@value='Delete']"));

        if (!deleteButtons.isEmpty()) {
            System.out.println("Адрес найден. Начинаю удаление...");

            deleteButtons.get(0).click();

            try {
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();
                System.out.println("Удаление подтверждено.");
            } catch (Exception e) {
                System.out.println("Окно подтверждения не появилось или возникла ошибка.");
            }

            MyFunc.wait(2);
        } else {

            System.out.println("Адресов нет, кнопка удаления отсутствует. Пропускаю.");
        }

        gozleBagla();
    }
}
