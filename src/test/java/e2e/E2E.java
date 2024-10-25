package e2e;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class E2E extends BaseTest {


    @Test(priority = 1)
    public void shouldBeAbleToSignUpWithNewUsernameAndPassword() {
        driver.findElement(By.id("signin2")).click();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.signup("newitiuser76678124", "123456789"); // New username
        String expectedMessage = "Sign up successful.";
        String actualMessage = handleAlert();
        Assert.assertEquals(actualMessage, expectedMessage, "Expected alert message was not displayed.");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login2")));
        }

    @Test(priority = 2)
    protected void shouldBeAbleToLoginWithCorrectUsernameAndPassword() {
        driver.findElement(By.id("login2")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToDemoblaze("newitiuser76678124", "123456789");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement navbarElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        Assert.assertTrue(navbarElement.getText().contains("Welcome"));
    }
    @Test(priority = 3)
    public void addProductstoCart() {
        //add the first product
        var product1Page = homePage.clickSamsungGalaxyS6Product();
        product1Page.clickAddToCart();
        product1Page.alert_clickToAccept();
        product1Page.clickHome();

        //add the second product
        var product2Page = homePage.clickSonyVaioi5();
        product2Page.clickAddToCart();
        product2Page.alert_clickToAccept();
    }

    @Test(priority = 4)
    public void testValidData_PlaceOrderModal() {
        var cartPage = homePage.clickCart();
        //Check the sum of products prices
        String SumOfProductPrices = cartPage.getSumOfProductPrices();
        String TotalPriceInCart = cartPage.getTotalPriceInCart();
        assertEquals(SumOfProductPrices, TotalPriceInCart, "Incorrect Total Price In Cart");

        //Fill in Purchase Modal
        var purchaseForm = cartPage.clickPlaceOrder();
        purchaseForm.fillPurchaseForm("DinaMagdy", "Egypt", "Mansoura", "card", "10", "2024");
        purchaseForm.clickPurchase();
        String message = purchaseForm.getPurchaseConfirmationMessage();
        purchaseForm.clickOK();
        assertEquals(message, "Thank you for your purchase!","Incorrect Purchase Message");
        purchaseForm.closeModal();
    }
}