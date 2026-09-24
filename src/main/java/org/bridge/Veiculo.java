package org.bridge;

public abstract class Veiculo {

    protected Motor motor;

    protected double capacidade;

    public Veiculo(double capacidade){
        this.capacidade = capacidade;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void setCapacidade(float capacidade){
        this.capacidade = capacidade;
    }

    public abstract double calcularCustodeConsumo();
}
