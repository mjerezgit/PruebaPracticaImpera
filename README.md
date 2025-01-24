
# Automatización login, navegacion y llenado de formulario Data Input de Impera.
Este proyecto esta enfocado en la automatización de la Aplicacion appianCloud de impera, utilizando como framwork de pruebas a Cucumber cn Selenium y java.

## 🚀 Comenzando

### 🚧 Prerrequisitos
````````
Antes de ejecutar este proyecto, debes tener instalados los siguientes programas en tu computadora:

- Intelij IDEA.
- Java Development Kit (JDK) versión 11 o posterior.
- Cucumber framwork.
- Apache Maven.
- Navegadores web Google Chrome.
````````

### 🔗 Dependencias

Este proyecto utiliza las siguientes dependencias:

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>


    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.7.1</version>
    </dependency>

    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>1.2.5</version>
    </dependency>

    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-jvm-deps</artifactId>
        <version>1.0.5</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>1.2.5</version>
        <scope>test</scope>
    </dependency>
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>3.1.1</version>
        </dependency>

        <dependency>
            <groupId>com.vimalselvam</groupId>
            <artifactId>cucumber-extentsreport</artifactId>
            <version>3.1.1</version>
        </dependency>

        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.18.0</version>
        </dependency>

            <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.3.0</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>7.10.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>6.10.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>6.10.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>6.10.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>6.10.4</version>
            <scope>test</scope>
        </dependency>


### 🛠️ Instalación
1. Clona este repositorio en tu máquina local.   

  https://github.com/mjerezgit/PruebaPracticaImpera.git

2. Instala las dependencias.    
    ```
   copiar y pegar las antes referenciadas en el archivo POM.xml
   

### 🌐 Aplicación bajo prueba
````
* https://impera.appiancloud.com/suite/?signin=native
  
  Aplicacion appianCloud de impera
````
### 👨🏼‍🔬 Pruebas
``````
Este proyecto contiene una clase steps los culaes contiene los casos a ejecutar.
``````
#### 🧪 Casos de Prueba
``````
 Scenario1: Ingresar a Appian a travez del login.
 Scenario2: Navegación al módulo de pruebas.
 Scenario3: Completar Formulario Data Input y validar creación del registro.
 ``````
#### 🏃🏽 Cómo ejecutar las pruebas
``````
Para ejecutar las pruebas de este proyecto:
- navegar hacia src/test/java/runner y abrir la clase TestRunner.
- dentro de la clase proceder a ejecutar la misma.
``````


