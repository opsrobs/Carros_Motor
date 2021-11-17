package com.company.model;

import com.company.model.Motor;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int velocMax;
    private Motor motor;



    public Veiculo(String placa, String marca, String modelo, int velocMax,int qtdPistao, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocMax = velocMax;
        motor = new Motor(qtdPistao,potencia);
    }

    //    abstract int calcVel(int velocMax){
//
//    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void velocidadeConvertida(){

    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "\nplaca='" + placa + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n modelo='" + modelo + '\'' +
                ",\n velocMax=" + velocMax +
                ",\n motor=" + motor +
                '}';
    }
}
