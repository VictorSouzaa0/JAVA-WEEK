package exercises;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salãrio mensal atual: ");
        double salary = input.nextDouble();

        if(salary <= 1900){
            System.out.println("Seu salãrio está issento de taxas");
        } else if (salary <= 2800) {
            System.out.printf("De acordo com seu salário será cobrado o imposto no valor de %.2f",((salary * 7.5)/100));
        } else{
            System.out.printf("De acordo com seu salário será cobrado o imposto no valor de %.2f",((salary * 15)/100));
        }
    }
}