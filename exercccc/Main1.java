class Main1 {

    static void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println("O número e maior que zero.");
        } else if (numero < 0) {
            System.out.println("O número e menor que zero.");
        } else {
            System.out.println("O número e igual a zero.");
        }
    }

    public static void main(String[] args) {
        verificarNumero(5); 
    }
}