package com.company.controller;

import com.company.model.Carga;
import com.company.model.Motor;
import com.company.model.Passeio;
import com.company.model.Veiculo;
import com.company.view.Utils;

public class Main {

    public static void main(String[] args) {
        Carga carga;
        Passeio passeio;
        Utils utils = new Utils();

        String placa;
        String marca;
        String modelo;
        int velocMax;
        int qtdPistao;
        int potencia;


        for (int i = 0; i <3 ; i++) {
            placa= utils.placa();
            marca=utils.marca();
            modelo=utils.modelo();
            velocMax= utils.velocMax();
            qtdPistao= utils.qtdPistao();
            potencia= utils.potencia();


            int op = Integer.parseInt("Qual o tipo do veiculo a ser cadastrado: \n1- Carga \n2- Passageiro");

            switch (op){
                case 1:carga = new Carga(placa,marca,modelo,velocMax,qtdPistao,potencia, utils.cargaMax());
                case 2:passeio = new Passeio(placa,marca,modelo,velocMax, qtdPistao,potencia, utils.qtdPassageiro());
            }

//            veiculo = new Veiculo(placa,marca,modelo,velocMax,utils.qtdPistao(),utils.potencia());
//            utils.addVeiculo(veiculo);

//            System.out.println(veiculo.toString());

        }
    }
}
