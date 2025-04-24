package runner;

import org.junit.jupiter.api.Test;
import reserva.ReservaService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaServiceTest {

    @Test
    public void testReservaComCidadeValida() {
        ReservaService reservaService = new ReservaService();
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaComCidadeInvalida() {
        ReservaService reservaService = new ReservaService();
        String resultado = reservaService.reservar("São Paulo", "Rua B");
        assertEquals("Área fora de cobertura", resultado);
    }
}
