Feature: Login Appian
  Como usuario quiero acceder a Appian a travez del login.

  Scenario: Ingresar a Appian a travez del login
    Given El usuario ingresa a la pagina de Appian
    When  El usuario ingresa el nombre de usuario "miguelf.jerez@gmail.com" y la contraseña "PruebaImpera2025"
    Then  El usuario es redireccionado al dashboard mostrando el mensaje de bienvenida

   Scenario: Navegación al módulo de pruebas.
    Given El usuario despliega el menu en pagina de Appian y hace click en la opción Automated Test Site
    Then  El usuario acceede al modulo de pruebas

   Scenario: Completar Formulario Data Input y validar creación del registro
     Given El usuario completa el formulario insertando el Title "Prueba6", el Quantity "6", el Price "255.22", el Start Date "02/20/2025",y la hora "4:00 PM"
     When  El usuario se dirige hacia la pestaña AUTOMATES TEST GRID, y selecciona el primer registro de la lista
    Then   El usuario valida la creación exitosa



