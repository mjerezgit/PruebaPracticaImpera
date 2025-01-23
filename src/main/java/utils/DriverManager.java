package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {


    private static WebDriver driver;

    // Método para obtener la instancia del WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().driverVersion("132.0.6834.83").setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Método para cerrar el WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
