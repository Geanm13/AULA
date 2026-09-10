package exercio_2_multi;

public class Main {
    public static void main(String[] args) {
        int [] [] numeros = {
            {1, 2, 3},
            {4, 5, 6, 10, 11},
            {7, 8, 9}
        };

        for (int[] linha: numeros){
            for (int numero : linha){
                System.out.print(numero);
            }
        }
    }
}
