public class Pizza {
    public String nome;
    public double valor;
    public boolean possuiBorda;

    public double CalcularValor(Boolean possuiBorda){
        if(possuiBorda){
            return valor + 5.00;

        }
        return valor;
    }
    public String ConsultarNome(){
        return nome;
    }
}
