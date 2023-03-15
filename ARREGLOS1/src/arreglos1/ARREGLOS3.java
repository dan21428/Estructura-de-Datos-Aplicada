package arreglos1;
/**
 *
 * @author kolfa
 */
import java.util.Scanner;
public class ARREGLOS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas del triángulo de Pascal: ");
        int n = sc.nextInt();
        sc.close();

        int[] triangle = new int[n];
        triangle[0] = 1;  

        /*for (int i = 0; i < n; i++) {
            int nt = 1;
            for (int j = 0; j <= i; j++) {
                 System.out.print(nt + " ");
                 nt = nt * (i - j)/(j + 1);
            }
            System.out.print("\n");*/
        
        int maxDigits = String.valueOf(triangle[n-1]).length();

        for (int i = 0; i < n; i++) {
            int padding = 1;
            padding = padding * (n - i - 1) + (maxDigits + 1) / 2;
            for (int j = 0; j <= padding; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-" + maxDigits + "d ", triangle[j]);
            }
            System.out.println();
        }
        
       }
 }
    

