package org.bridge;

public class Moto extends Veiculo{

    public Moto(double consumo){
        super(consumo);
    }

    public double calcularCustodeConsumo() {
        return this.consumo * this.motor.custoConsumo();
    }
}
