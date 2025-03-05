package exercises;

import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String name = input.next();

        System.out.println("Quantos anos você tem??");
        int age = input.nextInt();

        System.out.println("Qual é a sua altura?");
        double height = input.nextDouble();

        if(age >= 18){
            System.out.printf("Você se chama %s, possui %d anos, ou seja você é de maior, e a altura de %.2f",name,age,height);
        }else{
            System.out.printf("Você se chama %s, possui %d anos, ou seja você é de menor, e a altura de %.2f",name,age,height);
        }

    }
}
