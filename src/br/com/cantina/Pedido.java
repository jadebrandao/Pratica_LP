package br.com.cantina;

import javax.swing.*;

public class Pedido {

    public static void main(String[] args) {


        Cliente c= new Cliente();
        double valor = 0;
        double total = 0;
        boolean acrescimo = false;
        String nomeDoIngrediente = String.valueOf(false);




        String nome = JOptionPane.showInputDialog("Informe o nome do cliente ");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o nome da massa: \n1- Penne \n2-Espaguete \n3- Raviole \n4-Sair "));


        switch (opcao) {
            case 1:
                valor = 12;
                break;
            case 2:
                valor = 10;
                break;
            case 3:
                valor = 14;
                break;
            default:
                JOptionPane.showInputDialog("Opção invalida");


        }

        int ingrediente = Integer.parseInt(JOptionPane.showInputDialog("Escolha o seu Acrescimo : 1- Sim \n 2- Não"));

        if (nomeDoIngrediente.equals("1")) {
            boolean nomeDoIngradienteParaCalculo = true;
            total = (valor + 2);
            JOptionPane.showInputDialog(null, "O valor do seu pedido foi : " + total, JOptionPane.INFORMATION_MESSAGE);
        } else {
                nomeDoIngrediente = String.valueOf(false);
                JOptionPane.showInputDialog(null, "O valor do seu pedido foi " + valor, JOptionPane.INFORMATION_MESSAGE);
            }

        JOptionPane.showInputDialog(null, "Pedido feito por: " + nome, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null, " A massa escolhida foi: " + opcao, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null, "O ingrediente foi : " + ingrediente, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null, "Valor total : " + valor, JOptionPane.INFORMATION_MESSAGE);
        }
    }

