package exercio;

public class Par {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 

        boolean isNum1Even = num1 % 2 == 0;
        boolean isNum2Even = num2 % 2 == 0;

        if (isNum1Even) {
            System.out.println("O primeiro numero (" + num1 + ") e par.");
        } else {
            System.out.println("O primeiro numero (" + num1 + ") e impar.");
        }

        if (isNum2Even) {
            System.out.println("O segundo numero (" + num2 + ") e par.");
        } else {
            System.out.println("O segundo numero (" + num2 + ") e impar.");
        }
    }
}
