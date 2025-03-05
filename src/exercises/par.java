package exercises;

import java.util.Scanner;

public class par {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número:");
        int number = input.nextInt();

        if(number %2 ==0){
            System.out.printf("O %d é um número par", number);
        }else{
            System.out.printf("O %d é um número impar",number);
        }
    }
}
