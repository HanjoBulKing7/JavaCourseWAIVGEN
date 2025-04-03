/* 
Challenge: Precio del Cine
 
Escribe un programa que calcule el precio de una entrada de cine bajo las siguientes condiciones:
 
El precio de la entrada es de $10.
Si la persona es estudiante Y tiene 18 años de edad o menos, obtiene un 50% de descuento (el precio es $5).
Si la edad de la persona es menor a 13 años O mayor a 65 años, obtienen un descuento de 30% (el precio es $7).
Si ninguna de las condiciones mencionadas aplican, pagan el precio completo.
Si la edad es negativa, imprime “Edad Inválida” y no calcules el precio.
 
El programa debe tomar 2 inputs: la edad de la persona y si son estudiantes o no. Determina el precio final.
 
 */
package Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean estudia = false;
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();//Limpiar el buffer apra volver a leer
        System.out.println("¿Eres estudiante? (y/n)");
        estudia = sc.nextLine().trim().toLowerCase().charAt(0)=='y'; 

        if(edad <= 0){
            System.out.println("Edad inválida");
        }else if (edad <= 18 &&  estudia == true){
            System.out.println("Obtienes un descuento del 50% para tu entrada (precio final: $5)");
        }else if( edad < 13 && edad > 652){
            System.out.println("Obtienes un descuento del 70% para tu entrada (precio final: $7)"); 
        }else{
            System.out.println("El precio de tu entrada es de $10");
        }
    }
}
