package org.bridge;

public class Onibus extends Veiculo{

    public Onibus(double capacidade){
        super(capacidade);
    }

    public double calcularCustodeConsumo() {
        return this.capacidade * this.motor.custoConsumo();
    }
}
