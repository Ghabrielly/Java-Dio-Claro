import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        int parametroUm = 0, parametroDois = 0;
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro: ");
            parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            parametroDois = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números.");
        }
        contar(parametroUm,parametroDois);
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int parametro = parametroDois - parametroUm;
            for (int i = 0; i < parametro; i++) {
                System.out.println("Imprimindo o número "+ (i + 1));
            }
        }
    }
}