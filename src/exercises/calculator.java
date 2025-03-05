package exercises;

import java.util.Scanner;

public  class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("CONVERSOR DE CELCIUS PARA FAHRENHEIT");

        System.out.println("Insira a temperatura em celcius");
        double celcius = input.nextDouble();

        System.out.printf("Sua tenperatura em fahrenheit será de %.2f F %n" ,(celcius*1.8)+32);
        System.out.printf("Deseja fazer a conversão de fahrenheit para celcius agora? %n [1] SIM %n [2] Não");
        int choice = input.nextInt();

        if(choice == 1){

            System.out.println("Insira a temperatura em fahrenheit: ");
            double fah = input.nextDouble();

            System.out.printf("Sua temperatura em celcius será de %.2f",(fah - 32) *5/9);
        }else{
            System.out.println("Obrigado");
        }
    }
}