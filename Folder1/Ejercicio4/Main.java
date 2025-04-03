/*Escribe un programa que declare un array de 5 números enteros representando calificaciones de examenes.
Asigna valores a cada elemento manualmente.
Imprime el valor de la tercera calificación, el número total de calificaciones y el promedio.*/
package Ejercicio4;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades[] = new int[5], cont=0,suma=0;

        for(int j=0;j<grades.length;j++){
            System.out.print("Ingrese la calificación número "+(j+1)+": ");
            grades[ j ] = sc.nextInt();
        }
        
        for(int single_grade: grades){
            if(single_grade!=0){
                cont++;
                suma+=single_grade;
            }
        }
        System.out.println("La tercera calificación de las guardadas es: "+grades[2]);
        System.out.println("El número total de calificaciones dadas es: "+cont);
        System.out.println("El promedio de las calificaciones es: "+(float)suma / cont);
    }
}
