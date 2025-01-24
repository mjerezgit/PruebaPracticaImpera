package steps;

import Page.FormPage;
import Page.LoginPage;
import Page.ModuleNavigatePage;
import Page.VerifyCreationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;


public class Test {

    private WebDriver driver= Hooks.getDriver();

    @Given("^El usuario ingresa a la pagina de Appian$")
    public void el_usuario_ingresar_a_la_pagina_de_Appian() {
      // Write code here that turns the phrase above into concrete actions
        String url = "https://impera.appiancloud.com/suite?signin=native";
        driver.get(url);
        driver.manage().window().maximize();

        }

  @When("^El usuario ingresa el nombre de usuario \"([^\"]*)\" y la contraseña \"([^\"]*)\"$")
    public void el_usuario_ingresa_el_nombre_de_usuario_y_la_contraseña(String arg1, String arg2) throws Exception {
      // Write code here that turns the phrase above into concrete actions
        LoginPage login = new LoginPage(driver);
        login.loginImpera(arg1, arg2);
    }

    @Then("^El usuario es redireccionado al dashboard mostrando el mensaje de bienvenida$")
    public void el_usuario_es_redireccionado_al_dashboard_mostrando_el_mensaje_de_bienvenida() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue("El elemento no está visible en la página", login.dashboardPage());
    }


    @Given("^El usuario despliega el menu en pagina de Appian y hace click en la opción Automated Test Site$")
    public void el_usuario_despliega_el_menu_en_pagina_de_Appian_y_hace_click_en_la_opción_Automated_Test_Site()throws Exception  {
        // Write code here that turns the phrase above into concrete actions
        ModuleNavigatePage navigateMod = new ModuleNavigatePage(driver);
        navigateMod.navigateMenu();
    }

    @Then("^El usuario acceede al modulo de pruebas$")
    public void el_usuario_acceede_al_modulo_de_pruebas() throws Exception  {
        // Write code here that turns the phrase above into concrete actions
        ModuleNavigatePage navigateMod = new ModuleNavigatePage(driver);
        Assert.assertTrue("El elemento no está visible en la página", navigateMod.testGridPage());
    }

    @Given("^El usuario completa el formulario insertando el Title \"([^\"]*)\", el Quantity \"([^\"]*)\", el Price \"([^\"]*)\", el Start Date \"([^\"]*)\",y la hora \"([^\"]*)\"$")
    public void el_usuario_completa_el_formulario_insertando_el_Title_el_Quantity_el_Price_el_Start_Date_y_la_hora(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        FormPage formPage = new FormPage(driver);
        formPage.dataInputForm(arg1,arg2,arg3,arg4,arg5);
    }
    @When("^El usuario se dirige hacia la pestaña AUTOMATES TEST GRID, y selecciona el primer registro de la lista$")
    public void el_usuario_se_dirige_hacia_la_pestaña_AUTOMATES_TEST_GRID_y_selecciona_el_primer_registro_de_la_lista() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        FormPage formPage = new FormPage(driver);
        Assert.assertTrue("El elemento no está visible en la página", formPage.submitForm());
        VerifyCreationPage searchPage = new VerifyCreationPage(driver);
        searchPage.findCratedTest();
    }

    @Then("^El usuario valida la creación exitosa$")
    public void el_usuario_valida_la_creación_exitosa() throws Throwable {
        VerifyCreationPage searchPage = new VerifyCreationPage(driver);
        Assert.assertTrue("El registro no fue creado exitosamente", searchPage.confirmSearch());
        DriverManager.quitDriver();
    }
}
