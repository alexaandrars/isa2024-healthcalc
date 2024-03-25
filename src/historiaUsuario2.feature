Feature: Calculo BMR de una persona

    Como: usuario
	Quiero: poder introducir mis datos en la aplicación
	Para: obtener el cálculo de mi tasa metabolica basal

Scenario: los datos son introducidos correctamente y se devuelve la BMR
    Given Start to type your Given step here: el usuario ha introducido los datos sin errores
	When Start to type your When step here: el usuario clica en calcular BMR
	Then Start to type your Then step here: la aplicación devuelve el BMR de la persona con los datos introducidos

Scenario: los datos se han introducido de forma incorrecta
    Given Start to type your Given step here: el usuario ha introducido los datos con algún error
	When Start to type your When step here: el usuario clica en calcular peso ideal
	Then Start to type your Then step here: la aplicación vuelve a perdirle que introduzca los datos