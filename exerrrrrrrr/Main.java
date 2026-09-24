package exerrrrrrrr;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.combustivel = "Gasolina";
        carro.cor = "Preto";

        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Combustível: " + carro.combustivel);
        System.out.println("Cor: " + carro.cor);

        carro.ligarMotor();
        carro.desligarMotor();
    }
}