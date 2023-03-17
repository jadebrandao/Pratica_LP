import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {

        JOptionPane.showInputDialog("Seja bem-vindo! \n Informe o seu nome? ");
        JOptionPane.showInputDialog("Informe o telefone de contato: ");

        String opcao = JOptionPane.showInputDialog("Informe o produto desejado: \n1- Hamburguer \n2- Pizza \n3- Sair");
        if (opcao.equals("1")) {
            String nome = JOptionPane.showInputDialog("Informe o nome do Hambuguer");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Hamburgur"));

            String Artesanal = JOptionPane.showInputDialog("O Hamburguer será artesanal?  S-Sim \\n N=Não\"");
            boolean ArtesanalParaCalculo;


            if (Artesanal.equals("S")) {
                ArtesanalParaCalculo = true;
            } else {
                ArtesanalParaCalculo = false;
            }

            Pizza p = new Pizza();
            p.nome = nome;
            p.valor = valor;

            double valorTotal = p.CalcularValor(ArtesanalParaCalculo);

            JOptionPane.showInputDialog(null, "Pedido " + valorTotal, JOptionPane.INFORMATION_MESSAGE);



        } else if (opcao.equals("2")) {
            String nome = JOptionPane.showInputDialog("Informe o nome do Pizza");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Pizza"));


            String borda = JOptionPane.showInputDialog("Você deseja borda?  S-Sim \n N=Não");
            boolean bordaParaCalculo;

            if (borda.equals("S")) {
                bordaParaCalculo = true;
            } else {
                bordaParaCalculo = false;
            }

            Pizza p = new Pizza();
            p.nome = nome;
            p.valor = valor;

            double valorTotal = p.CalcularValor(bordaParaCalculo);

            JOptionPane.showInputDialog(null, "Pedido" + valorTotal, JOptionPane.INFORMATION_MESSAGE);


        }


    }
}





