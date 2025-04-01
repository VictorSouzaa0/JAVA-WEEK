package forex;
public class exemples {
    public static void main(String[] args) {

        String [] cars = {"BMW","MERCEDES","FERRARI","ASTON MARTIN","BUGATTI"};
        //Abre o for
        //cria um varíavel com valor de 1
        //realiza a comparação: enquanto a variavel for menor que a quantidade de indíce do array
        //ele realiza soma ele e +1
        for(int i = 0; i <  cars.length; i++){
            System.out.println("Carrinhos: " + cars[i]);
        }
    }
}