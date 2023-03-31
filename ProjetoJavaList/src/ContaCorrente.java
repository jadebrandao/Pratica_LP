public class ContaCorrente {
    int saldo;

    public void depositar ( int valorDeposito){
    saldo= (saldo + valorDeposito);

    }

    public int getSaldo() {
        return saldo;
    }

   Cliente cliente;

}
