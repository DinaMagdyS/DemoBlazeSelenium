
package login;



import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest extends BaseTest {
    @Test
    protected void loginWithEmptyUsernameAndEmptyPassword() {
        driver.findElement(By.id("login2")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToDemoblaze("", "");
        String alertMessage = handleAlert();
        Assert.assertEquals("Please fill out Username and Password.", alertMessage);
    }

    @Test
    protected void loginWithCorrectUsernameAndEmptyPassword() {
        driver.findElement(By.id("login2")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToDemoblaze("sarahmohamed", "");
        String expectedMessage = "Please fill out Username and Password.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
    }

    @Test
    protected void loginWithEmptyUsernameAndCorrectPassword() {
        driver.findElement(By.id("login2")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToDemoblaze("", "312");

        String expectedMessage = "Please fill out Username and Password.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");

    }

    @Test
    protected void shouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        driver.findElement(By.id("login2")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToDemoblaze("sarahmohamed", "312");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement navbarElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        Assert.assertTrue(navbarElement.getText().contains("Welcome"));

    }
}
