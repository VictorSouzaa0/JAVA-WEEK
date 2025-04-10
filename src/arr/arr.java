package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class arr {

    public static void main(String[] args) {

        //Array Unidimensional
        //Se trata de um array que tem um tamanho fixo e não cresce dinamicamente

        String[]cars = {"Audi","Volkswagen","Toyota","GM"};
        cars[0] = "Nissan";
        for(String Car : cars){
            System.out.println(" - " + Car);
        }
        //Arrayy Bidmensional

        String [][]Cars = {
                {"M3","Cayenne","G63"},//indice 0
                {"Corolla","Nivus","Subaru"}, // Indice 1
                {"Compass","Commander","Civic"}// indice 2
        };
        //Priemiro for para listar cada proprietário de acordo com o índice, começando com 1
        for(int x = 0; x < Cars.length; x++){
            System.out.println("Proprietário " + (x+1) + " :");
            // para cada proprietário que ele passar ele vai listar cada índice
            for(int j = 0; j < Cars[x].length; j++){
                System.out.println(" - " +Cars[x][j] + " ");
            }
        }
    }
}