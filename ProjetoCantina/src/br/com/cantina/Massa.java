package br.com.cantina;

public class Massa {

    public String tipoDeMassa;
    public String valor;

    public String getTipoDeMassa() {
        return tipoDeMassa;
    }

    public void setTipoDeMassa(String tipoDeMassa) {
        this.tipoDeMassa = tipoDeMassa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Massa() {
        this.tipoDeMassa = tipoDeMassa;
        this.valor = valor;
    }
}
