 import java.util.Scanner;

public class ExemploThrow {
    public static final String SENHASECRETA = "123456";

    public static void main(String[] args) {

        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Digita a senha: ");
            String senha = s.nextLine();
            if (!senha.equals(SENHASECRETA)){
                throw new Exception("Senha invalida!!");

        }
        System.out.println("Senha correta !!\n Bem Vindo (a)!!!");

        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }


    }

}





