package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class Categories {
    private WebDriver driver;
    private By phonesCategory = By.xpath("//a[text() = 'Phones']");
    private By laptopsCategory = By.xpath("//a[text() = 'Laptops']");
    private By monitorsCategory = By.xpath("//a[text() = 'Monitors']");
    private By categorySection = By.id("tbodyid");
    private By sectionProducts = By.cssSelector(".card-block");
    WebDriverWait wait;



    public Categories(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    }

    public void getListOfPhones() {
        driver.findElement(phonesCategory).click();
    }
    public void getListOfLaptops()  {
        driver.findElement(laptopsCategory).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-block")));
    }

    public void getListOfMonitors() {
        driver.findElement(monitorsCategory).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-block")));
    }


    public List<WebElement> listCategorySectionProducts(){
        WebElement section = driver.findElement(categorySection);
        return section.findElements(sectionProducts);
    }
}
