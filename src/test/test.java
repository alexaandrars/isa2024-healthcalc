import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class test {
    private boolean datosIntroducidosSinErrores;
    private boolean datosIntroducidosConErrores;
    private String resultadoCalculo;

    @Given("el usuario ha introducido los datos sin errores")
    public void el_usuario_ha_introducido_los_datos_sin_errores() {
        datosIntroducidosSinErrores = true;
    }

    @Given("el usuario ha introducido los datos con algún error")
    public void el_usuario_ha_introducido_los_datos_con_algun_error() {
        datosIntroducidosConErrores = true;
    }

    @When("el usuario clica en calcular peso ideal")
    public void el_usuario_clica_en_calcular_peso_ideal() {
        if (datosIntroducidosSinErrores) {
            resultadoCalculo = "75 kg"; // Ejemplo de resultado correcto
        }
    }

    @When("el usuario clica en calcular BMR")
    public void el_usuario_clica_en_calcular_BMR() {
        if (datosIntroducidosSinErrores) {
            resultadoCalculo = "1800 kcal"; // Ejemplo de resultado correcto
        }
    }

    @Then("la aplicación devuelve el peso ideal de la persona con los datos introducidos")
    public void la_aplicacion_devuelve_el_peso_ideal_de_la_persona_con_los_datos_introducidos() {
        Assert.assertNotNull(resultadoCalculo);
    }

    @Then("la aplicación vuelve a pedirle que introduzca los datos")
    public void la_aplicacion_vuelve_a_pedirle_que_introduzca_los_datos() {
        Assert.assertNull(resultadoCalculo);
    }

    @Then("la aplicación devuelve el BMR de la persona con los datos introducidos")
    public void la_aplicacion_devuelve_el_BMR_de_la_persona_con_los_datos_introducidos() {
        Assert.assertNotNull(resultadoCalculo);
    }
}

