package org.bridge;

public abstract class Veiculo {

    protected Motor motor;

    protected double consumo;

    public Veiculo(double consumo){
        this.consumo = consumo;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void setConsumo{float consumo}{
        this.consumo = consumo;
    }

    public abstract double calcularCustodeConsumo();
}
