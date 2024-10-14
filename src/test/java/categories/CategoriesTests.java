package categories;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CategoriesTests extends BaseTest {

    @Test
    public void testLaptopsCategory(){
        var categories = homePage.getCategories();
        categories.getListOfLaptops();
        List<WebElement> products = categories.listCategorySectionProducts();
        int laptopProductSize = products.size();
        assertTrue(laptopProductSize > 0,"Incorrect Number of Product in Category");
    }
    
    @Test
    public void testMonitorsCategory() {
        var categories = homePage.getCategories();
        categories.getListOfMonitors();
        List<WebElement> products = categories.listCategorySectionProducts();
        int monitorsProductSize = products.size();
        assertTrue(monitorsProductSize > 0,"Incorrect Number of Product in Category");
    }
}
