package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private final WebDriver driver;
    private final By signInLink = By.className("login");
    private final By emailCreate = By.id("email_create");
    private final By createBtn = By.id("SubmitCreate");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome() { driver.get("http://automationpractice.com/index.php"); }

    public void clickSignIn() { driver.findElement(signInLink).click(); }

    public void startCreateAccount(String email) {
        driver.findElement(emailCreate).sendKeys(email);
        driver.findElement(createBtn).click();
    }
}
