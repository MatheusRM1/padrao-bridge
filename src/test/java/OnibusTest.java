import org.bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    @Test
    void deveRetornarConsumoDeOnibusComMotorACombustao() {
        Motor motor = new Combustao();
        Onibus onibus = new Onibus(400.0);
        onibus.setMotor(motor);
        assertEquals(2616.0, onibus.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeOnibusComMotorEletrico() {
        Motor motor = new Eletrico();
        Onibus onibus = new Onibus(400.0);
        onibus.setMotor(motor);
        assertEquals(440.0, onibus.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeOnibusComMotorHibrido() {
        Motor motor = new Hibrido();
        Onibus onibus = new Onibus(400.0);
        onibus.setMotor(motor);
        assertEquals(1528.0, onibus.calcularCustodeConsumo(), 0.01f);
    }
}