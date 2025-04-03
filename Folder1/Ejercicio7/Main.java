/*Declara un array de 8 números enteros representando precios de productos:
[100, 250, 150, 300, 220, 180, 400, 120]
Usa un loop para contar cuántos precios están por debajo de $200 e imprímelos.
Después, imprime la cuenta total.
 */
package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        int precios [] = {100, 250, 150, 300, 220, 180, 400, 120}, suma = 0;
        System.out.println("Lista de precios mayores a $200");
        for(int precio: precios){
            if(precio<200)System.out.println("$"+precio);
            suma+=precio;
        }
        System.out.println("La cuenta total es: "+suma);
    }
}
