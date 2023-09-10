package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final WebDriver driver;
    private final By firstProduct = By.cssSelector("ul#homefeatured li:first-child .product-name");
    private final By addToCartBtn = By.cssSelector("ul#homefeatured li:first-child a.button.ajax_add_to_cart_button");
    private final By proceedToCheckout = By.cssSelector("a.btn[title='Proceed to checkout']");

    public ProductPage(WebDriver driver) { this.driver = driver; }

    public void goToHome() { driver.get("http://automationpractice.com/index.php"); }

    public void addFirstProductToCart() {
        driver.findElement(firstProduct).click();
        // product page -> click add to cart
        driver.findElement(addToCartBtn).click();
    }

    public boolean isCartModalDisplayed() {
        try {
            return driver.findElement(proceedToCheckout).isDisplayed();
        } catch (Exception e) { return false; }
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }
}
