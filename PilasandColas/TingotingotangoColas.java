/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasandColas;
import static PilasandColas.TingotingotangoColas.TingoTingoTango.calcularEliminado;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author kolfa
 */
public class TingotingotangoColas {
    
         public static void main(String[] arg){
             Scanner scanner = new Scanner(System.in);
            

    System.out.print("Ingrese el numero de jugadores: ");
    
    int numeroJugadores = scanner.nextInt();
    System.out.println("Empezando el juego de Tingo tingo tango..."); 
     calcularEliminado(numeroJugadores);

}
         public class TingoTingoTango {

    public static void calcularEliminado(Integer numeroJugadores ) {
      int numeroDeRondas = numeroJugadores;
        Queue<Integer> queue = new LinkedList<>();
        
        // Añadir jugadores a la cola
        for (int i = 1; i <= numeroJugadores; i++) {
            queue.add(i);
        }
      
        // Empezar a pasar el tango
        while (queue.size() > 1) {
            for (int i = 0; i < numeroDeRondas; i++) {
                queue.add(queue.remove());
            }
            int jugadorEliminado = queue.remove();
            System.out.println("El jugador " + jugadorEliminado + " ha sido eliminado");
        }
         int ganador = queue.remove();
         System.out.println("El jugador " + ganador + " ha ganado"); 
    
        
    }   
      
}   
    
}
