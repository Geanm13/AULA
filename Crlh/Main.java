package Crlh;

public class Main {
    public static void main(String[] args) {
        boolean acesa = true;

        if (acesa) 
            System.out.println("A luz esta acesa.");
            else {
                System.out.println("A luz esta apagada.");
        }
        
        String msg = (acesa) ? "A luz esta acesa." : "A luz esta apagada.";
        System.out.println(msg); 
        {
         
        int idade = 20;
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
   }
