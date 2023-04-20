package br.com.cantina;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente c;
    Massa M;
    List<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

    public double CalcularValor() {
        //pegando o valor inicial da massa para calculo
        double valorInicial = M.valor;
        //pegando o tamanho da lista que corresponde
        //quantidade de ingredientes escolhida
        int qtdIngredientesEscolhidas = listaIngredientes.size();
        double valorTotalIngredientes = qtdIngredientesEscolhidas * 2;
        double valorPedido = valorInicial + valorTotalIngredientes;
            return valorPedido;

    }



}
