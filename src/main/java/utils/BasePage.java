package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {

    }

    // Método para esperar que un elemento sea visible
    protected void waitForElement(WebElement element) throws InterruptedException {
        driver.wait(10000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Método para hacer clic en un elemento
    protected void clickElement(WebElement element) {

        element.click();
    }

    // Método para escribir texto en un campo de texto
    protected void sendKeysToElement(WebElement element, String text) {

        element.sendKeys(text);
    }

    public void switchToWindow() {
        driver = DriverManager.getDriver();
        Iterator var1 = this.driver.getWindowHandles().iterator();

        while(var1.hasNext()) {
            String winHandle = (String)var1.next();
            this.driver.switchTo().window(winHandle);
            this.driver.manage().window().maximize();
        }
    }
 }