/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos1;

/**
 *
 * @author kolfa
 */
public class ARREGLOS4 {
     public static void main(String[] args) {
    System.out.println("   Municipio       Candidato A     Candidato B     Candidato C    Candidato D"); 
    int [][] votos = {
       {194,48,206,45},
        {180,20,320,16},
        {221,90,140,20},
        {432,50,821,14},
        {820,61,946,18}
    };
    
     
       for (int i=0;i<votos.length;i++){
           System.out.print("\t"+(i+1)+"\t \t");
           for (int j=0;j<votos[i].length;j++){
           System.out.print(votos[i][j] + "\t \t");
               }
          System.out.println();
           
       }
       int totalVotos = 0;
        int[] votosCandidatos = new int[4];
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[i].length; j++) {
                votosCandidatos[j] += votos[i][j];
                totalVotos += votos[i][j];
    }
}
        double porcentajeVotacion = 0;
        String MasVotado = "";
        for (int i = 0; i < votosCandidatos.length; i++) {
            double porcentaje = votosCandidatos[i] * 100.0 / totalVotos;
            System.out.printf("El candidato %c recibio %d votos (%.2f%%)\n", 
                (char) ('A' + i), votosCandidatos[i], porcentaje);
            if (porcentaje > porcentajeVotacion) {
                porcentajeVotacion = porcentaje;
                MasVotado = "Candidato " + (char) ('A' + i);
            } else if (porcentaje == porcentajeVotacion) {
                MasVotado = "Empate entre candidatos " + MasVotado + " y " + "Candidato " + (char) ('A' + i);
            }
        }
        System.out.println(MasVotado + " fue el candidato con mayor numero de votos.");
        for (int i = 0; i < votosCandidatos.length; i++) {
            if (votosCandidatos[i] * 2 > totalVotos) {
                System.out.printf("El candidato %c ha ganado las elecciones\n", (char) ('A' + i));
                return;
            }
        }
        int maxVotos = 0;
        }
}
