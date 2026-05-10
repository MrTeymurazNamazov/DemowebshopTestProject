package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.*;
import static org.junit.Assert.assertTrue;

public class usVote {
    @Test
    public void test001() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-login']")));
        WebElement excelentbtn = driver.findElement(By.id("pollanswers-1"));
        wait.until(ExpectedConditions.elementToBeClickable(excelentbtn));
        excelentbtn.click();
        System.out.println("Excelent btn is pressed");

        WebElement votebtn = driver.findElement(By.xpath("//input[@class='button-2 vote-poll-button']"));
        votebtn.click();
        System.out.println("Vote btn is pressed");

        WebElement textmsg = driver.findElement(By.xpath("//*[text()='Only registered users can vote.']"));
        wait.until(ExpectedConditions.elementToBeClickable(textmsg));
        assertTrue(textmsg.isDisplayed());
        System.out.println("Only registered users can vote message is displayed");

        gozleBagla();
    }
}