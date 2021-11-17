package com.company.model;

public class Passeio extends Veiculo {

    private int qtdPassageiro;

    public Passeio(String placa, String marca, String modelo, int velocMax, int qtdPistao, int potencia, int qtdPassageiro) {
        super(placa, marca, modelo, velocMax, qtdPistao, potencia);
        this.qtdPassageiro = qtdPassageiro;
    }
}
