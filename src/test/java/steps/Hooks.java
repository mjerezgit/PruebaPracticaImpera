package steps;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import java.io.File;
import java.io.IOException;


public class Hooks{

    private static WebDriver driver;
    private DriverManager driverManager;
    public Hooks() {}

@Before
    public void openBrowser() {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            // Tomar la captura de pantalla
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Guardar la captura de pantalla en una ubicación
            String screenshotPath = "/screenshots/" + scenario + ".png";
            try {
                FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Adjuntar la captura de pantalla al reporte de Cucumber
            Reporter.addScreenCaptureFromPath(screenshotPath);
        }
    }
    public static WebDriver getDriver(){return driver;}

}

