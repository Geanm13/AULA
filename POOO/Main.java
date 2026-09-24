public class Main {

    public static void main(String[] args) {
        Personagem persona = new Personagem();
        persona.setNome("Bolsonaro");
        persona.setIdade(67);
        persona.setPoder(22);

        System.out.println("Nome: " + persona.getNome());
        System.out.println("Idade: " + persona.getIdade());
        System.out.println("Poder: " + persona.getPoder());
        persona.pular();
        persona.correr();
    }
}

class Personagem {
    private String nome;
    private int idade;
    private int poder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void pular() {
        System.out.println(nome + " esta pulando!");
    }

    public void correr() {
        System.out.println(nome + " esta correndo!");
    }
}