package com.company.model;

public class Carga extends Veiculo{
    private int cargaMax;

    public Carga(String placa, String marca, String modelo, int velocMax, int qtdPistao, int potencia, int cargaMax) {
        super(placa, marca, modelo, velocMax, qtdPistao, potencia);
        this.cargaMax = cargaMax;
    }

}
