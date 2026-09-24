package org.bridge;

public class Onibus extends Veiculo{

    public Onibus(double consumo){
        super(consumo);
    }

    public double calcularCustodeConsumo() {
        return this.consumo * this.motor.custoConsumo();
    }
}
