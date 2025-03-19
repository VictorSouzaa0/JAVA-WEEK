package TryCatch;
import java.util.Scanner;

public class catchh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insira um numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
        }catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }catch (Exception e) {
            System.out.println("Erro:  Entrada inválida, Certfique se de inserir números inteiros");
        }finally {
            scanner.close();
        }            System.out.println("Programa finalizado");

    }
    public static int dividir(int a, int b){
        return  a/b;
    }
}
