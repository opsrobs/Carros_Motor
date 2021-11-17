package com.company.model;

public class Motor {
    private int qtdPistao;
    private int potencia;

    public Motor(int qtdPistao, int potencia) {
        this.qtdPistao = qtdPistao;
        this.potencia = potencia;
    }

    public Motor() {
    }

    public int getQtdPistao() {
        return qtdPistao;
    }

    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "qtdPistao=" + qtdPistao +
                ",\n potencia=" + potencia +
                '}';
    }
}
