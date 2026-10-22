 class Jogador {
    String jogador;
    String posicao;
    int numeroCamisa;
    int numero_de_gols;
    
   void marcarGol() {
       System.out.println (jogador + " marcou um gol!");

    }
}

public class Main {         
    public static void main (String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.jogador = "Neymar Jr";
        jogador1.posicao = "Atacante";
        jogador1.numeroCamisa = 10;
        jogador1.numero_de_gols = 10;
        System.out.println ("Gols marcados por " + jogador1.jogador + ": " + jogador1.numero_de_gols);



        Jogador jogador2 = new Jogador();
        jogador2.jogador = "Lionel Messi"; 
        jogador2.posicao = "Atacante";
        jogador2.numeroCamisa = 30;
        jogador2.numero_de_gols = 1;
        System.out.println ("Gols marcados por " + jogador2.jogador + ": " + jogador2.numero_de_gols);


        if (jogador1.numero_de_gols > jogador2.numero_de_gols) {
            System.out.println (jogador1.jogador + " marcou mais gols que " + jogador2.jogador);
        } else if (jogador1.numero_de_gols < jogador2.numero_de_gols) {
            System.out.println (jogador2.jogador + " marcou mais gols que " + jogador1.jogador);
        } else {
            System.out.println ("Ambos os jogadores marcaram a mesma quantidade de gols.");
            }
           }
          }

    
