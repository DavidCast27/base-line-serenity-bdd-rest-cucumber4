# Linea base para automatización de Servicios 
### usando la libreria de Serenity BDD

Proyecto base para proyectos de automatización de servicios, usando el patron __Screenplay__, implementado las librerias de con __SerenityBDD__ y __Serenity Rest__.
Utilizando __Cucumber__  en su version 4 como herramienta para escribir las pruebas, en su version 4.

## Referencia:
- [The Serenity BDD Book - Rest](https://serenity-bdd.github.io/theserenitybook/0.0.1/serenity-screenplay-rest.html)
- [Getting started with Serenity BDD and Cucumber 4](https://johnfergusonsmart.com/getting-started-with-serenity-bdd-and-cucumber-4/)
- [Getting started with REST API testing with Serenity and Cucumber](https://johnfergusonsmart.com/getting-started-with-rest-api-testing-with-serenity-and-cucumber/)

## Requerimientos

Para correr el proyecto se necesita:
 * Java JDK 1.8 o superior 
 * Gradle V5.2.1. o superior
 * plugin de Cucumber for Java
 * Si usa IntelliJ como IDE se recomienda la version 2020 

## Para correr el proyecto

Ejecutar el comando:

    gradle clean test aggregate -i
