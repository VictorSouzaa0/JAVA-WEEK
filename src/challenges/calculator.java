package challenges;

import java.util.InputMismatchException;
import java.util.Scanner;


public  class calculator {
    public static void main(String[] args) {
        boolean into_while = false;
        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo;
        while (into_while == false) {
            try {
                System.out.println("Selecione o operador: \n" +
                        "[1] Soma\n" +
                        "[2] Subtração\n" +
                        "[3] Divisão \n" +
                        "[4] Multiplicação\n" +
                        "[5] POTÊNCIAÇÃO\n" +
                        "[0] SAIR");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:

                        System.out.println("Você selecionou SOMA:\n" +
                                "Insira o primeiro valor: ");
                        numberOne = input.nextInt();
                        System.out.println("Insira o segundo valor: ");
                        numberTwo = input.nextInt();

                        int operation = numberOne + numberTwo;
                        System.out.println("SOMA [+] \n" +
                                "Resultado: " + operation);
                        break;
                    case 2:

                        System.out.println("Você selecionou SUBTRAÇÃO: \n" +
                                "Insira o primeiro valor: ");
                        numberOne = input.nextInt();
                        System.out.println("Insira o segundo valor");
                        numberTwo = input.nextInt();
                        operation = numberOne - numberTwo;
                        System.out.println("Você selecionou: SUBTRAÇÃO \n" +
                                "Resultado: " + operation);
                        break;
                    case 3:
                        System.out.println("Você selecionou DIVISÃO: \n" +
                                "Insira o segundo valor: ");
                        numberOne = input.nextInt();
                        System.out.println("Insira o segundo valor: ");
                        numberTwo = input.nextInt();
                        operation = numberOne / numberTwo;
                        System.out.println("Você selecionou: DIVISÃO \n" +
                                "Resultado: " + operation);
                        break;
                    case 4:

                        System.out.println("Você selecionou MULTIPLICAÇÃO: \n" +
                                "Insira o primeiro valor: ");
                        numberOne = input.nextInt();
                        System.out.println("Insira o segundo valor: ");
                        numberTwo = input.nextInt();
                        operation = numberOne * numberTwo;
                        System.out.println("Você selecionou: MULTIPLICAÇÃO\n" +
                                "Resultado: " + operation);
                        break;
                    case 5:
                        System.out.println("Você selecionou POMTÊNCIAÇÃO\n" +
                                "Insira o primeiro valor: ");
                        double nOne = input.nextInt();
                        System.out.println("Insira o segundo valor: ");
                        double nTwo = input.nextInt();
                        System.out.println("O número " + nOne + " elevado á " + nTwo + "O resultado é : " + Math.pow(nOne, nTwo));
                        break;
                    case 0:
                        into_while = true;
                    default:
                        System.out.println("Nenhuma das opções foram inseridas");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira um número rapaz, tente novamente");
                into_while = true;
            } catch (ArithmeticException e) {
                System.out.println("Insira um valor acima de zer0, tente novamente.");
            } finally {
                System.out.println("Muito Obrigado!!");
            }
        }
    }
}