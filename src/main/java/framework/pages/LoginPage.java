package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private final By signInLink = By.className("login");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("passwd");
    private final By submitBtn = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome() {
        driver.get("http://automationpractice.com/index.php");
    }

    public void clickSignIn() { driver.findElement(signInLink).click(); }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitBtn).click();
    }

    public boolean isAtLoginPage() { return driver.getTitle().toLowerCase().contains("login"); }
}
