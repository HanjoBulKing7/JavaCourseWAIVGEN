/*Declara un arreglo de 7 doubles representando las temperaturas de toda una semana:
[72.5, 68.3, 75.0, 70.1, 69.8, 73.2, 71.0]
Usa un for loop para calcular e imprimir la temperatura promedio de la semana.
Después, imprime cada temperatura que esté por encima de la temperatura promedio.

Output esperado:
    Average temperature: 71.41
    Temperatures above average:
    72.5
    75.0
    73.2*/
package Ejercicio5;

public class Main {
    

    public static void main(String[] args) {
        double temps[] = {72.5, 68.3, 75.0, 70.1, 69.8, 73.2, 71.0}, avg_temp=0.0, total_temp=0.0;
        for(double current_temp: temps){
            total_temp+=current_temp;
        }

        System.out.println("Average temperature: "+(total_temp/temps.length));
        System.out.println("Temperatures above average:");
        for(double current_temp: temps){
            if(current_temp>(total_temp/temps.length))System.out.println(current_temp);
        }

    }
}
