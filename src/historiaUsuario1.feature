Feature: Cálculo del peso ideal de una persona

  Como usuario
  Quiero poder introducir mis datos en la aplicación
  Para obtener el cálculo de mi peso ideal

  Scenario: Los datos son introducidos correctamente y se devuelve el peso ideal
    Given el usuario ha introducido los datos sin errores
    When el usuario clica en calcular peso ideal
    Then la aplicación devuelve el peso ideal de la persona con los datos introducidos.

  Scenario: Los datos se han introducido de forma incorrecta
    Given el usuario ha introducido los datos con algún error
    When el usuario clica en calcular peso ideal
    Then la aplicación vuelve a pedirle que introduzca los datos
