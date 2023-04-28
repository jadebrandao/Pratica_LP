public class Divide1 {
    public static void main(String[] args) {

        int  dividendo = Integer.parseInt(args [0]);
        int  dividor =  Integer.parseInt(args[1]);

        try {
            divide(dividendo,dividor);

        }catch (ArithmeticException e) {

            System.out.println("Não pode  dividir por zero!");
        }
    }
    public   static void divide (int dividendo, int  divisor){
        System.out.println("Divisao = " + (dividendo/divisor));
    }
}
