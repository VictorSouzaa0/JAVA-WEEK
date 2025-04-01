package sla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean into_while = true;
        while (into_while == true) {
            try {
                System.out.println("Operadores: \n" +
                        "[1] SOMA \n" +
                        "[2] SUBTRAÇÃO\n" +
                        "[3] DIVISÃO\n" +
                        "[4] MULTIPLICAÇÃO\n" +
                        "[5] SAIR\n"+
                        "Escolha o operador: ");

                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("OPERADOR SELECIONADO: SOMA");
                    System.out.println("Insira o primeiro valor: ");
                    int number1 = input.nextInt();
                    System.out.println("Insira o segundo valor: ");
                    int number2 = input.nextInt();

                    System.out.println("Resultado da soma: "+ (number1+number2));
                    System.out.println("Deseja sair? Pressione 1 para sair ou qualquer telca númerica para continuar: ");
                    choice = input.nextInt();
                    if (choice == 1){
                        break;
                    }
                }else if(choice == 2){
                    System.out.println("OPERADOR SELECIONADO: SUBTRAÇÃO");
                    System.out.println("Insira o primeiro valor: ");
                    int number1 = input.nextInt();
                    System.out.println("Insira o segundo valor: ");
                    int number2 = input.nextInt();

                    System.out.println("Resultado da subtração: "+ (number1-number2));
                    System.out.println("Deseja sair? Pressione 1 para sair ou qualuqer tecla númwerica para continuar");
                    choice = input.nextInt();
                    if (choice == 1){
                        break;
                    }else{
                        into_while = true;
                    }
                } else if (choice == 3) {
                    System.out.println("OPERADOR SELECIONADO: DIVISÃO");
                    System.out.println("Insira o primeiro valor: ");
                    int number1 = input.nextInt();
                    System.out.println("Insira o segundo valor: ");
                    int number2 = input.nextInt();

                    System.out.println("Resultado da soma: "+ (number1/number2));
                    System.out.println("Deseja sair? Pressione 1 para sair ou qualquer tecla númerica para continuar");
                    if (choice == 1){
                        break;
                    }
                } else if (choice == 4) {
                    System.out.println("OPERADOR SELECIONADO: MULTIPLICAÇÃO");
                    System.out.println("Insira o primeiro valor: ");
                    int number1 = input.nextInt();
                    System.out.println("Insira o segundo valor: ");
                    int number2 = input.nextInt();
                    System.out.println("Resultado da soma: "+ (number1*number2));
                    System.out.println("Deseja sair? Pressione 1 para sair ou qualquer tecla númerica para continuar");
                    choice =  input.nextInt();
                    if (choice == 1){
                        break;
                    }

                }else if (choice == 5){
                    System.out.println("Programa finalizado");
                    break;
                }else{
                    System.out.println("Nenhuma  das opções acima não selecionada. Tente novamente");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você inseriu uma string ao invés de um número inteiro \n" +
                        "Reinicie o programa e tente novamente");
                break;
            }
        }
    }
}
