package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;
import utils.DriverManager;
import java.util.concurrent.TimeUnit;

public class ModuleNavigatePage extends BasePage {

    //Constructor
    public ModuleNavigatePage (WebDriver driver){super(driver);}

    // Localizadores
    By principalMenuButton = By.xpath("(//button[contains(@class,'Button_SITE_HEADER_LAYOUT_NAME_NAVIGATION_MENU')] | //span[contains(text(),'Navigation')])[3]");
    By modPruebaOption = By.xpath("//span[contains(text(),'Automated Test Site')]");
    By gridButton = By.xpath("(//button[@class='Button---btn Button---default_direction Button---small appian-context-first-in-list appian-context-last-in-list Button---inSideBySide Button---search Button---icon_start'])[1]");

   // Metodo para navegar el menu principal y acceder a la opcion del modulo de pruebas.
    public void navigateMenu()throws Exception{
    driver = DriverManager.getDriver();
    try {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickElement(driver.findElement(principalMenuButton));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickElement(driver.findElement(modPruebaOption));
    }catch (Exception e){
        throw new Exception("No pudo ser posible navegar hacia el modulo de pruebas", e);
         }
    }

    // Metodo para confirmar que se logro entrar al modulo de pruebas.
    public boolean testGridPage()throws Exception{
        driver = DriverManager.getDriver();
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            switchToWindow();
            return driver.findElement(gridButton).isDisplayed();
        }catch(Exception e){
            throw new Exception("No se pudo validar presentación Grid de pruebas", e);
        }
    }
}
