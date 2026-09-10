package Array_multi;

public class Main {
    public static void main(String[] args) {
        int[][] numeros = { 
            {1, 4, 2, 4},
            {2, 6, 8, 6}, 
            {3, 5, 6, 7}, 
            {1, 3, 5, 8},
        };

    //     for (int i = 0; i < 4; i++) {
    //         for (int j = 0; j < 4; j++) {
    //             System.out.print(numeros[i][j] + " ");
    //         }
    //     }
    // }
    for (int i = 0; i < numeros.length; i++) {
        for (int j = 0; j < numeros[i].length; j++) {
            System.out.print(numeros[i][j] + " ");
        }
        System.out.println();
    }
    }
}