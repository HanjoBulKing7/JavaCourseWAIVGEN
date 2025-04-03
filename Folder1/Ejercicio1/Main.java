/*Ejercicio 4: Clasificador de Edades
 
Escribe un programa que acepte la edad de una persona como input y la clasifique en alguno de los siguientes grupos:
 
0 a 12: Niño
13 a 19: Adolescente
20 a 59: Adulto
60 y más: Adulto Mayor
Si la edad es negativa, imprime “Edad inválida”*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificaciíon del alumno: ");
        int student_cal = sc.nextInt();
        char letra;
          if(student_cal>89 && student_cal<=100){
                letra = 'A';  
            } else if(student_cal>79 && student_cal<90){
                letra = 'B';
            }else if(student_cal>69 && student_cal<80){
                letra = 'C';
            }else if(student_cal>59 && student_cal<70){
                letra = 'D';
            }else{
                letra = 'F';
            }
            System.out.println("La calificación final es: "+letra);
    }
}