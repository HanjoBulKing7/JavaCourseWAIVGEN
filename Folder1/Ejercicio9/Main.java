/*
Declara un array de 5 Strings representando nombres de ciudades:
["New York", "london", "Paris", "TOKYO", "Sydney"]
Usa un for loop para:
    1. Convertir el nombre de la ciudad a MAYÚSCULAS.
    2. Guardar el valor modificado en un nuevo array.
Imprime los valores del nuevo array.*/
package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        String [] cities = {"New York", "london", "Paris", "TOKYO", "Sydney"};
        String [] new_cities = new String [5];
        for(int j=0; j<cities.length; j++){
                new_cities [j] = cities[j].toUpperCase();
        }
        for(String e: new_cities){
            System.out.println(e);
        }
    }
}