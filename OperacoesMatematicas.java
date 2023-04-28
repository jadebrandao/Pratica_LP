import javax.swing.*;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        System.out.println("Inicie o programa.");

        try {

            int a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));

            System.out.println("Divisão = " + (a / b));
            System.out.println("Multiplicacao = " + (a * b));
            System.out.println("Soma= " + (a + b));
            System.out.println("Subtração= " + (a - b));

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Não pode dividir por zero!");

        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Não pode dividir por zero!");

        }

        System.out.println("Fim  do  Programa");
    }
}


