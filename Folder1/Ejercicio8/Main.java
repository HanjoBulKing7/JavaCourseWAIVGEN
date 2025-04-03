/*Declara un array de 10 números enteros inicializados con valores del 1 al 10.
Usa un for loop para doblar el valor de cada número PAR en el array.
*/
package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2==0){
                nums[j]=nums[j]*2;
            }
        }
        for(int num: nums){
           System.out.println(num);
        }
    }
}