package org.bridge;

public class Moto extends Veiculo{

    public Moto(double capacidade){
        super(capacidade);
    }

    public double calcularCustodeConsumo() {
        return this.capacidade * this.motor.custoConsumo();
    }
}
