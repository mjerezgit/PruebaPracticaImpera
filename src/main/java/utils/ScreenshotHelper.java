package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotHelper {


    // Método para capturar la pantalla
    public static String captureScreenshot(WebDriver driver, String scenarioName) {
        // Toma la captura de pantalla
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Crear un nombre único para el archivo de la captura de pantalla
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = scenarioName + "_" + timestamp + ".png";

        // Definir la ruta donde se guardará la imagen
        String screenshotPath = "resources/screenshots/" + screenshotName;

        try {
            // Guardar la imagen en la ruta definida
            FileUtils.copyFile(screenshot, new File(screenshotPath));
        } catch (Exception e) {
            System.out.println("Error al guardar el screenshot: " + e.getMessage());
        }

        // Devolver la ruta para agregarla al reporte
        return screenshotPath;
    }
}
