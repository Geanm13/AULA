package exercio;

public class Aprovado {
    public static void main(String[] args) {
        int nota = 5; 
        boolean isAprovado = nota >= 6;

        if (isAprovado) {
            System.out.println("O aluno foi aprovado com a nota: " + nota);
        } else {
            System.out.println("O aluno foi reprovado com a nota: " + nota);
        }
    }
}
