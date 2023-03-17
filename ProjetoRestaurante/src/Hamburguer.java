public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public double CalcularValor(Boolean Artesanal){
        if(Artesanal){
            return valor + 8.00;

        }

        return valor;
    }
    public String ConsultarNome(){
        return nome;
    }
}
