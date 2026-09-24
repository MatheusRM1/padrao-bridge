package org.bridge;

public class Carro extends Veiculo{

    public Carro(double consumo){
        super(consumo);
    }

    public double calcularCustodeConsumo() {
        return this.consumo * this.motor.custoConsumo();
    }
}
