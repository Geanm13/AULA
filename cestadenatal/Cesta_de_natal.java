package cestadenatal;

public class Cesta_de_natal {

    Itens item_1 = new Itens ("Panetone", "Um", "2", "R$ 20,00");
    Itens item_2 = new Itens ("Vinho", "002", "1", "R$ 50,00");
    Itens item_3 = new Itens ("Queijo", "003", "1", "R$ 30,00");
    Itens item_4 = new Itens ("Presunto", "004", "1", "R$ 40,00");

    Itens[] cesta = {item_1, item_2, item_3, item_4};
    
    for (Itens item : cesta) {
        System.out.println("Item: " + item.nome + " | Código: " + item.codigo + " | Quantidade: " + item.quantidade + " | Preco: " + item.preco);
    }
    
}
