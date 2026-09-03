package Exercicio_foreach;

public class Main {
    public static void main(String[] args) {
    //     String[] alunos = {"Bruno", "Bolsonaro", "Lula", "Renan Santos", "Kim Kataguri", "Nikolas Ferreira", "Varcaro"};
         
    //    alunos [0] = "Caneta Azul";
    //    System.out.println ("Quantidade de alunos: " + alunos.length);
       
    //     for (String missao : alunos) {
    //         System.out.println(missao);
    //     }
        //   String [] partidos = {"PSDB", "PT", "PL", "PP", "PSOL", "PDT", "MDB"};
        //   for (String partido : partidos) {
        //       System.out.println(partido);
        //   }

        String [] times_de_futebol = {"Palmeiras", "Corinthians", "Santos", "Sao Paulo", "Flamengo", "Vasco", "Botafogo", "Fluminense"};
        for (int i = 0; i < times_de_futebol.length; i++) {
            System.out.println("Time: " + times_de_futebol[i]);
        }
    }
}
