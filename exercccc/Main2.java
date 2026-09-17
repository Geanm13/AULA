class Main2 {

    static void verificarAprovacao(String nome, double nota) {
        if (nota >= 7) {
            System.out.println(nome + " esta aprovado.");
        } else {
            System.out.println(nome + " nao esta aprovado.");
        }
    }

    public static void main(String[] args) {
        verificarAprovacao("Joao", 8.5);  
        verificarAprovacao("Maria", 6.0); 
    }
}