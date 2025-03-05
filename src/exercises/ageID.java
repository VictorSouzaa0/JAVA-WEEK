package exercises;

import java.util.Scanner;

public class ageID {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int age = input.nextInt();

        if(age <18){
            System.out.println("Menor de idade");
        } else if (age <60) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
