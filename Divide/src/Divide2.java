public class Divide2 {
    public static void main(String[] args) {
        try {
            int dividendo = Integer.parseInt(args[0]);
            int dividor = Integer.parseInt(args[1]);
            divide(dividendo, dividor);

        } catch (ArithmeticException e1) {
            System.out.println("Não pode dividir  por zero!");


        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Favor Informar dois numeros!");

        }
    }
        public static void  divide(int dividendo,int dividor){
            System.out.println("Divisão= " + (dividendo/dividor));
        }
    }

