
public class Fatec {
    
    public static void main(String[] args) {
        
        Aluno aluno_1 = new Aluno ("Bruno", "bruno.gean@gmail.com");
        Aluno aluno_2 = new Aluno ("Anna", "anna@gmail.com");
        Aluno aluno_3 = new Aluno ("Julia", "julia@gmail.com");
        Aluno aluno_4 = new Aluno ("Reis", "reis@gmail.com");

        Aluno[] sala = {aluno_1, aluno_2, aluno_3, aluno_4};

        for (Aluno item : sala) {
            System.out.println("Aluno: " + item.nome + " " + item.email);
        }
    }
}
