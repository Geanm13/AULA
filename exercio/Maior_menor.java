package exercio;

public class Maior_menor {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 

        boolean isNum1Greater = num1 > num2;

        if (isNum1Greater) {
            System.out.println("O primeiro numero (" + num1 + ") e maior que o segundo numero (" + num2 + ").");
        } else {
            System.out.println("O segundo numero (" + num2 + ") e maior que o primeiro numero (" + num1 + ").");
        }
    }
}