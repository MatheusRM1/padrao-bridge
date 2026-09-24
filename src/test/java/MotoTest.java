import org.bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveRetornarConsumoDeMotoComMotorACombustao() {
        Motor motor = new Combustao();
        Moto moto = new Moto(20.0);
        moto.setMotor(motor);
        assertEquals(130.8, moto.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeMotoComMotorEletrico() {
        Motor motor = new Eletrico();
        Moto moto = new Moto(20.0);
        moto.setMotor(motor);
        assertEquals(22, moto.calcularCustodeConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDeMotoComMotorHibrido() {
        Motor motor = new Hibrido();
        Moto moto = new Moto(20.0);
        moto.setMotor(motor);
        assertEquals(76.4, moto.calcularCustodeConsumo(), 0.01f);
    }
}