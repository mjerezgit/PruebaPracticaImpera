package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BasePage;
import utils.DriverManager;
import java.util.concurrent.TimeUnit;

public class FormPage extends BasePage {

    // Constructor
    public FormPage(WebDriver driver) {super(driver);}

    // Localizadores

    By titleInput = By.xpath("//input[@id='5ce80332c594f867f0b293695cd065d42']");
    By quantityInput = By.xpath("//input[@id='9b1575dcc876861e3d036ade418c9e0e']");
    By priceInput = By.xpath("//input[@id='ab2394d6de304e9fb1c19b9c5b671ec3']");
    By dateInput = By.xpath("//input[@id='17c3bcabc5bc35c107a19cf7d8efd70e_datePicker']");
    By hourInput = By.xpath("//input[@id='17c3bcabc5bc35c107a19cf7d8efd70e_timePicker_value']");
    By submitButton = By.xpath("//button[@type='Button'] | //span[contains(text(),'Submit')]");
    By confirmationLable = By.xpath("//*[contains(text(),'Action completed')]");

    // Metodo para completar la informacion del formulario.
public void dataInputForm(String titleV, String quantityV, String priceV, String dateV, String hourV)throws Exception{
    driver = DriverManager.getDriver();
    try{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        switchToWindow();
        Actions actions = new Actions(driver);
        WebElement dataInputTab = driver.findElement(By.xpath("(//a[@class='VirtualNavigationMenuTab_HELIUM_TOPBAR---nav_tab_clickable_container elements---global_a'])[2]"));
        actions.moveToElement(dataInputTab).click().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sendKeysToElement(driver.findElement(titleInput), titleV);
        sendKeysToElement(driver.findElement(quantityInput), quantityV);
        sendKeysToElement(driver.findElement(priceInput), priceV);
        sendKeysToElement(driver.findElement(dateInput), dateV);
        sendKeysToElement(driver.findElement(hourInput), hourV);

    } catch (Exception e) {
        throw new Exception("No se pudo completar el formulario Data Input", e);
    }
}

    // Metodo para hacer click en submit y confirmar que se completo el formulario.
public boolean submitForm()throws Exception{
    driver = DriverManager.getDriver();
    try{
        clickElement(driver.findElement(submitButton));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(confirmationLable).isDisplayed();

    }catch(Exception e){
        throw new Exception("No se pudo validar presentación Dashboard", e);
        }
    }
}
