package Exercicio_WHILE;

public class Umcem {
    public static void main(String[] args) {
        int contador = 1000;
        while (contador >= 0) {
            if (contador % 2 == 0) {
                System.out.println("Contador: " + contador);
            
            }
            contador--;
        }
    }
}
