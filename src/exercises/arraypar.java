package  exercises;

import java.util.Scanner;

public  class arraypar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int enter;
        int [] arr = {};
        int count = 0;

        while (count <=10){

            System.out.println("Insira qualquer número: ");
            enter = input.nextInt();
            for(int x = 0; x <=arr.length;x++){
                System.out.println(arr);
            }
            count++;

        }
    }
}
