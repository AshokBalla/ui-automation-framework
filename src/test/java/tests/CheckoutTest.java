package tests;

import base.BaseTest;
import framework.pages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void addToCartAndProceed() throws InterruptedException {
        ProductPage pp = new ProductPage(driver);
        pp.goToHome();
        Thread.sleep(2000);
        pp.addFirstProductToCart();
        Thread.sleep(2000);
        Assertions.assertTrue(pp.isCartModalDisplayed(), "Cart modal should be visible after adding product");
        // proceed to checkout if available
        try {
            pp.proceedToCheckout();
        } catch (Exception ignored) {}
    }
}
