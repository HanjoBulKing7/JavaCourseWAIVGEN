/*Ejercicio 5: Semáforo
Escribe un programa que tome un color de semáforo “Rojo”, “Amarillo” o “Verde” como input e imprima la acción apropiada:
Rojo: Alto
Amarillo: Bajar velocidad
Verde: Avance
Otro input: Color inválido*/
package Ejercicio2;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un color: ");
        String color = sc.nextLine().trim().toLowerCase();

        switch(color){
            case "rojo":
                System.out.println("¡Alto!");
            break;
            case "amarillo":
                System.out.println("//Bajar velocidad\\");
            break;
            case "verde":
                System.out.println("Avance -->");
            break;
            default:
                System.out.println("Color inválido");
        }
    }
}
