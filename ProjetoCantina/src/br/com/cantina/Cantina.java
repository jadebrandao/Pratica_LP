package br.com.cantina;

import javax.swing.JOptionPane;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Cantina {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        String nome =  JOptionPane.showInputDialog("Informe o nome do cliente");
        Cliente c = new Cliente();
        c.nome = nome;
        p.c = c;
        String nomeMasssa = JOptionPane.showInputDialog("Informe o nome da massa");
        Massa m = new Massa();
        m.tipoMassa = nomeMasssa;
        Double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa"));
        m.valor = valorMassa;
        p.M = m;

        int opcao = 0;

        Ingrediente ingrediente = new Ingrediente();

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ingrediente desejado:\n1-Bancon" +
                    "\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));
            if (opcao == 1){
                ingrediente.nomeIngrediente ="Bacon";
                p.listaIngredientes.add(ingrediente);
            }
            if (opcao == 2){
                ingrediente.nomeIngrediente ="Mussarela";
                p.listaIngredientes.add(ingrediente);
            }
            if (opcao == 3){
                ingrediente.nomeIngrediente ="Tomate";
                p.listaIngredientes.add(ingrediente);
            }
            if (opcao == 4){
                ingrediente.nomeIngrediente ="Queijo";
                p.listaIngredientes.add(ingrediente);
            }
            double valorTotalPedido = p.CalcularValor();




        }







    }
}
