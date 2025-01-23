package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BasePage;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class VerifyCreationPage extends BasePage {

    //constructor
    public VerifyCreationPage(WebDriver driver) {super(driver);}

    // Localizadores
    By confirmationLabel = By.xpath("(//p[@class='ParagraphText---richtext_paragraph ParagraphText---default_direction ParagraphText---align_start elements---global_p'])[1]");
    By searchResult = By.xpath("(//a[@class='elements---global_a'])[6]");

    // Metodo que busca el ultimo registro creado
    public void findCratedTest()throws Exception{
        driver = DriverManager.getDriver();
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            switchToWindow();
            Actions actions = new Actions(driver);
            WebElement gridTestTab = driver.findElement(By.xpath("(//a[@class='VirtualNavigationMenuTab_HELIUM_TOPBAR---nav_tab_clickable_container elements---global_a'])[1]"));
            actions.moveToElement(gridTestTab).click().perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            clickElement(driver.findElement(searchResult));

        } catch (Exception e) {
            throw new Exception("No se pudo completar la busqueda del registro", e);
        }
    }
    public boolean confirmSearch()throws Exception{
        driver = DriverManager.getDriver();
        try{

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver.findElement(confirmationLabel).isDisplayed();

        }catch(Exception e){
            throw new Exception("No se pudo validar presentación Dashboard", e);
        }
    }
}
