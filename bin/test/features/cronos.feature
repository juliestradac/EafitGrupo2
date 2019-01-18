
@Regresion
Feature: Consular requerimientos
  Como usuario
Quiero consultar los requerimientos de bienes
A través de la pagina de acceso a la aplicación cronos
  
   @ConsultarUnaFecha
  Scenario: Consultar requerimientos de bienes en una fecha especifica
    Given que yo quiero consultar requerimientos de bienes
    When se selecciona una fechaini "17/01/2018" y una fechafin "17/01/2018"
    Then se muestra el mensaje "54 Registros encontrados, página 1 de 6"