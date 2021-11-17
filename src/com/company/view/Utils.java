package com.company.view;

import com.company.model.Veiculo;

import javax.swing.*;
import java.util.ArrayList;

public class Utils {
    private ArrayList<Veiculo> lista = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo){
        this.lista.add(veiculo);
    }

    public int  qtdPistao(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pistões: "));
    }
    public int potencia(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia de cavalos sque o motor tem: "));
    }

    public String placa(){
        return JOptionPane.showInputDialog("Informe a placa do veiculo: ");
    }
    public String marca(){
        return JOptionPane.showInputDialog("Informe a marca do veiculo: ");
    }
    public String modelo(){
        return JOptionPane.showInputDialog("Informe a modelo do veiculo: ");
    }
    public int velocMax(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do veiculo"));
    }
    public int cargaMax(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a carga maxima do veiculo: "));
    }
    public int qtdPassageiro(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de passageiros: "));
    }


}
