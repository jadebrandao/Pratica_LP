import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog("informe o nome do cliente:");
[]
        String nomeBanco = (JOptionPane.showInputDialog("Digite o nome do banco"));

        Banco b = new Banco();

        ArrayList<Conta> contas = new ArrayList<>();

        try {
            Scanner leitor = new Scanner(new File("C:C:/Users/jade.brandao/IdeaProjects/ComplementarArquivo/contas1.txt"));
            while (leitor.hasNextLine()) {
                String dadosConta = leitor.nextLine();
                String[] dado = dadosConta.split(",");
                Conta c = new Conta();
                c.setNumero(Integer.parseInt( dado[0]));
                c.setAgencia(Integer.parseInt( dado[1]));
                c.setSaldo(Integer.parseInt( dado[3]));

                b.contas.add(c);


                //Quebrar o nome usando split


            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }




        System.out.println("Lista de clientes:");
        boolean Dados = false;
        for (Dados : Dados) {
            System.out.println(Dados);
        }
    }
}
