package Array;
public class array {
    public static void main(String[] args) {

        int countA = 0;
        String[] friends = {"Claúdio","Victor","Matins","Bruno","Adalberto","Alisson"};
        for(int i = 0; i<friends.length; i++){
            String names =friends[i];

            if (names.startsWith("A")){
                countA++;
            }

        }
        System.out.println("Quantidade dos números que começam com a letra A: "+ countA);
    }
}