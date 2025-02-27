package  day1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("CALULADORAAAAA");
        double number1,number2;

        System.out.println("Insira o primeiro número: ");
        number1 = input.nextDouble();
        System.out.println("Insira o segundo núnero: ");
        number2 = input.nextDouble();
        System.out.printf("O resultado total da soma foi de %.2f", (number1+number2));
    }
}