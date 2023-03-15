import java.util.Scanner;
public class cris {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
         
         int n, nt;
         System.out.print("Ingrese el numero de filas del triangulo de Pascal:");
         n = entrada.nextInt();
         
         for(int i = 0; i < n; i++){
             nt = 1;
             
             for(int j = 0; j <= i; j++){
                 System.out.print(nt + " ");
                 nt = nt * (i - j)/(j + 1);
             }
             System.out.print("\n");
         }
    }   
}


