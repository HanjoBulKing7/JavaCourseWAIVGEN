/*Crea un arreglo de 5 Strings representando nombres de estudiantes:
[Alicia, Roberto, Carlos, Diana, Arturo]
Usa un while loop para buscar el nombre "Diana" en el array.
Si se encuentra, imprime la posición en la que está.
Si no se encuentra, imprime el mensaje "Nombre no encontrado". */
package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        String nombres [] = {"Alicia", "Roberto", "Carlos", "Diana", "Arturo"}, nombre="";
        int pos = 0;
        boolean existe=false;
        while(nombre!="Diana" && pos<nombres.length){
            nombre = nombres[pos];
            existe = nombre=="Diana";
            pos++;
        }
        if(existe){
            System.out.println("Se encontró el nombre Diana en la posición: "+pos);
        }else{
            System.out.println("Nombre no encontrado");
        }

    }
}
