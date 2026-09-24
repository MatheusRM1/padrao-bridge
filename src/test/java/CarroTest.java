import org.bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarConsumoDeCarroComMotorACombustao() {
        Motor motor = new Combustao();
        Carro carro = new Carro(55.0);
        carro.setMotor(motor);
        assertEquals(359.7, carro.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeCarroComMotorEletrico() {
        Motor motor = new Eletrico();
        Carro carro = new Carro(55.0);
        carro.setMotor(motor);
        assertEquals(60.5, carro.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeCarroComMotorHibrido() {
        Motor motor = new Hibrido();
        Carro carro = new Carro(55.0);
        carro.setMotor(motor);
        assertEquals(210.1, carro.calcularCustodeConsumo(), 0.01f);
    }
}