package Learn;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nummber1,nuumber2,total;

        System.out.println("Insert the first number: ");
        nummber1 =  input.nextInt();

        System.out.println("Insert the second number: ");
        nuumber2 = input.nextInt();

        System.out.println("Select operator: " +
                "\n [ + ]" +
                "\n[ - ]" +
                "\n[ * ]" +
                "\n[ / ]");
         String operator = input.nextLine();

        if(operator == "+"){
            total = nummber1 + nuumber2;

            System.out.println("Result: " + total);
        }
    }
}
