package Learn;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String product;
        double price,total;
        int amount;

        System.out.println("How product do you want?: ");
        product = scanner.nextLine();

        System.out.println("How much this?");
        price = scanner.nextDouble();

        System.out.println("How many you want this product?: ");
        amount = scanner.nextInt();

        total = price * amount;

        System.out.println("Product Select: " + product);
        System.out.printf("Total this purschese: %.2f",total);


    }
}