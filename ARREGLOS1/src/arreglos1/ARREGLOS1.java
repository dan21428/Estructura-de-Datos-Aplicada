/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos1;

/**
 *
 * @author kolfa
 */
public class ARREGLOS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int[][] matriz = {{4, 7, 1, 3, 5}, {2, 0, 6, 9, 7}, {3, 1, 2, 6, 4}};
      int filas = matriz.length;
      int columnas = matriz[0].length;

      int[][] nuevaMatriz = new int[columnas][filas];
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            nuevaMatriz[j][i] = matriz[i][j];
         }
      }

      for (int i = 0; i < columnas; i++) {
         for (int j = 0; j < filas; j++) {
            System.out.print(nuevaMatriz[i][j] + " ");
         }
         System.out.println();
      }
   }
}
    

