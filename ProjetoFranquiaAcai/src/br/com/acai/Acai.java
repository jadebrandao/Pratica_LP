package br.com.acai;

public class Acai {
    public int tamanho;
    public double valor;
    public boolean acrescimoSorvete;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAcrescimoSorvete() {
        return acrescimoSorvete;
    }

    public void setAcrescimoSorvete(boolean acrescimoSorvete) {
        this.acrescimoSorvete = acrescimoSorvete;
    }

    public Acai(int tamanho, double valor, boolean acrescimoSorvete) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.acrescimoSorvete = acrescimoSorvete;
    }
}