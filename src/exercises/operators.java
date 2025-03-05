package exercises;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Qual operação você deseja?: %n " +
                "[1] - SOMA %n " +
                "[2] - SUBTRAÇÃO %n " +
                "[3] - MULTIPLICAÇÃO %n" +
                "[4] - DIVISÃO %n");
        int choice = input.nextInt();
        double numberOne,numberTwo;

        if(choice == 1){
            System.out.printf("VOCÊ SELECIIONOU: SOMA %n");

            System.out.println("Insira o prmeiro valor:");
            numberOne = input.nextDouble();
            System.out.println("Insira o segundo valor: ");
            numberTwo = input.nextDouble();

            System.out.printf("O resultado da soma : %.2f ", numberOne + numberTwo);
        } else if (choice == 2) {
            System.out.printf("VOCÊ SELECINOU: SUBTRAÇÃO %n");

            System.out.println("Insira o prmeiro valor:");
            numberOne = input.nextDouble();
            System.out.println("Insira o segundo valor: ");
            numberTwo = input.nextDouble();

            System.out.printf("O resultado da subtração: %.2f", numberOne - numberTwo);
        } else if (choice == 3) {
            System.out.printf("VOCÊ SELECINOU: MULTIPLICAÇÃO %n");

            System.out.println("Insira o prmeiro valor:");
            numberOne = input.nextDouble();
            System.out.println("Insira o segundo valor: ");
            numberTwo = input.nextDouble();

            System.out.printf("O resultado da multiplicação: %.2f", numberOne * numberTwo);
        } else if (choice == 4) {
            System.out.printf("VOCÊ SELECINOU: DIVISÃO %n");

            System.out.println("Insira o prmeiro valor:");
            numberOne = input.nextDouble();
            System.out.println("Insira o segundo valor: ");
            numberTwo = input.nextDouble();

            System.out.printf("O resultado da divisão: %.2f", numberOne / numberTwo);
        }
    }
}
