package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    // localizadores de la página de Login
    By usernameInput = By.xpath("//input[@id='un']");
    By passwordInput = By.xpath("//input[@id='pw']");
    By signInButton = By.xpath("//input[@value='Sign In' or @value='Entrar']");

    // Localizador Dashboard
    By welcomLabel = By.xpath("//span[contains(text(),'Welcome,')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);}

    // Metodo para realizado login en Impera
    public void loginImpera(String username, String password) throws Exception {
        driver = DriverManager.getDriver();
           try {

               sendKeysToElement(driver.findElement(usernameInput), username);
               sendKeysToElement(driver.findElement(passwordInput), password);
               clickElement(driver.findElement(signInButton));
       }catch (Exception e){
               throw new Exception("No pudo ser posible realizar el login", e);
       }
    }

    // Metodo para confirmar login
    public boolean dashboardPage()throws Exception{
        driver = DriverManager.getDriver();
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver.findElement(welcomLabel).isDisplayed();

        }catch(Exception e){
            throw new Exception("No se pudo validar presentación Dashboard", e);
        }
    }
}
