package signup;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {

    @Test
    public void shouldBeAbleToSignUpWithNonExistingUsernameAndPassword() {

        driver.findElement(By.id("signin2")).click();

        SignupPage signupPage = new SignupPage(driver);
        signupPage.signup("newi53477489", "32205"); // New username

        String expectedMessage = "Sign up successful.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
    }


    @Test
    public void signupWithAnExistingUsername() {

        driver.findElement(By.id("signin2")).click();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.signup("sarahmohamed", "312");

        String expectedMessage = "This user already exist.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
    }

    @Test
    public void signupWithUsernameAndEmptyPassword() {

        driver.findElement(By.id("signin2")).click();

        SignupPage signupPage = new SignupPage(driver);
        signupPage.signup("sarahmohamed", ""); // Empty password

        String expectedMessage = "Please fill out Username and Password.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
    }

    @Test
    public void signupWithEmptyUsernameAndPassword() {

        driver.findElement(By.id("signin2")).click();

        SignupPage signupPage = new SignupPage(driver);
        signupPage.signup("", "312");

        String expectedMessage = "Please fill out Username and Password.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
    }
}
