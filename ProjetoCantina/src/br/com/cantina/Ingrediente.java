package br.com.cantina;

public class Ingrediente {
    public String nomeDoIngrediente;

    public String getNomeDoIngrediente() {
        return nomeDoIngrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    public Ingrediente(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }
}
