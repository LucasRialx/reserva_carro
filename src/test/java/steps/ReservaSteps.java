package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import reserva.ReservaService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaSteps {

    private ReservaService reservaService;
    private String resultado;

    @Given("que o passageiro está em {string} e deseja reservar um carro para o endereço {string}")
    public void dadoQueOPassageiroDesejaReservarUmCarro(String cidade, String endereco) {
        reservaService = new ReservaService();
        resultado = reservaService.reservar(cidade, endereco);
    }

    @Then("o sistema deve retornar a mensagem {string}")
    public void entaoOSistemaDeveRetornarAMensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}
