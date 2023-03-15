/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos1;

/**
 *
 * @author kolfa
 */
public class ARREGLOS2 {
    public static void main(String[] args) {
    int[][] matriz = {{4, 7, -5, 4, 9}, {0, 3, -2, 6, -2}, {1, 2, 4, 1, 1}, {6, 1, 0, 3, -4}};
      int suma = 0;

      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            if (i != j) {
               suma += matriz[i][j];
            }
         }
      }

      System.out.println("La suma de los elementos que no pertenecen a la diagonal principal es: " + suma);
   }
}
