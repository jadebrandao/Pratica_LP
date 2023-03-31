import java.util.ArrayList;
import java.util.List;
public class Banco {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente();
        cl1.nome= "Jade";
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);
        c1.cliente= cl1;

        Cliente cl2 = new Cliente();
        cl2.nome = "Brandão";
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(200);
        c2.cliente=cl2;

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        System.out.println("O tamanho da lista de contas é? " + contas.size());

        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente  contaTeste = (ContaCorrente) contas.get(i);
            System.out.println("O valor da conta: " +contaTeste.cliente.nome + " é : " + contaTeste.getSaldo());

        }
    }
}
