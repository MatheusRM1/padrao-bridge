package org.bridge;

public class Carro extends Veiculo{

    public Carro(double capacidade){
        super(capacidade);
    }

    public double calcularCustodeConsumo() {
        return this.capacidade * this.motor.custoConsumo();
    }
}
