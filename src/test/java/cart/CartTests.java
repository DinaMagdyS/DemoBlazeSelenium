package cart;

import base.BaseTest;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class CartTests extends BaseTest {


    @Test (priority = 1)
    public void testOneItemPlacedInCart() {
        var productPage = homePage.clickSamsungGalaxyS6Product();
        productPage.clickAddToCart();
        productPage.alert_clickToAccept();
        var cartPage = productPage.clickCart();
        assertEquals(cartPage.getNameOfPlacedOrder(),
                "Samsung galaxy s6",
                "Incorrect Item Added To Cart");
    }


    @Test (priority = 2)
    public void testAllItemsPlacedInCart() {
        var product1Page = homePage.clickSamsungGalaxyS6Product();
        product1Page.clickAddToCart();
        product1Page.alert_clickToAccept();
        product1Page.clickHome();
        var product2Page = homePage.clickSonyVaioi5();
        product2Page.clickAddToCart();
        product2Page.alert_clickToAccept();
        var cartPage = product2Page.clickCart();
        List<String> expectedProducts = Arrays.asList("Samsung galaxy s6", "Sony vaio i5");
        assertEqualsNoOrder(cartPage.getListOfPlacedOrders(),
                expectedProducts,
                "List Of Placed Orders is Incorrect");
    }

    @Test (dependsOnMethods = "testOneItemPlacedInCart", priority = 1)
    public void testDeleteItemFromCart() {
        var cartPage = homePage.clickCart();
        cartPage.clickDeleteItem();
    }

    @Test (priority = 3)
    public void testCorrectTotalPriceInCart() {
        var cartPage = homePage.clickCart();
        String SumOfProductPrices = cartPage.getSumOfProductPrices();
        String TotalPriceInCart = cartPage.getTotalPriceInCart();
        System.out.println(SumOfProductPrices);
        System.out.println(TotalPriceInCart);
        assertEquals(SumOfProductPrices, TotalPriceInCart, "Incorrect Total Price In Cart");
    }


    @Test (dependsOnMethods = "testCorrectTotalPriceInCart", priority = 3)
    public void testDeleteAllItemsFromCart(){

        var product1Page = homePage.clickSamsungGalaxyS6Product();
        product1Page.clickAddToCart();
        product1Page.alert_clickToAccept();
        var homePage = product1Page.clickHome();
        var product2Page = homePage.clickSonyVaioi5();
        product2Page.clickAddToCart();
        product2Page.alert_clickToAccept();
        var cartPage = product2Page.clickCart();
        cartPage.deleteAllItemsInCart();
    }


}

