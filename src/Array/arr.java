package  Array;
import java.util.InputMismatchException;
import java.util.Scanner;



public class arr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos nomes você deseja? ");
        int vol = input.nextInt();

        String[] names = new String[vol];
        for(int i = 0;i<vol; i++){
            System.out.println("Digite o nome do número" + (i+1) +" : ");
            names[i] = input.nextLine();
        }
        int countA = 0;
        for(int i = 0;i<names.length;i++  ){
            String name = names[i];
            if(name.startsWith("A") || name.startsWith("a")){
                countA++;
            }

        }
        System.out.println("Você digitou " + countA + " nome(s)");
    }
}