import  java.util.Scanner;
public class ExemploFinally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        try {
            int dividendo, divisor;
            System.out.println("Digite o valor do dividendo ");
            dividendo = s.nextInt();
            System.out.println("Digite  o valor do divisor:");
            divisor = s.nextInt();

            if (divisor == 0) {

                throw new Exception("Não e  permtido  fazer uma  divisao por zero");
            }

            System.out.println(dividendo + "/" + divisor + "=" + (dividendo/divisor));

        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());

        }finally {
            System.out.println("Bloco Finally.");
        }

    }


}
