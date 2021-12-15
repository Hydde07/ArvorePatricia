package trabalhopopatricia;

import ArvorePatricia.PTree;

public class TrabalhoPOPatricia {

 
    public static void main(String[] args) {
        PTree tree = new PTree();
        //EXERCÍCIO 2 ---------------------------------------------
        tree.inserir("bear");
        tree.inserir("Bell");
        tree.inserir("bid");
        tree.inserir("Bull");
        tree.inserir("buy");
        tree.inserir("sell");
        tree.inserir("stock");
        tree.inserir("stop");
        System.out.print("EXIBIÇÃO POR NÍVEL:");
        tree.exibeNivel();
        //EXERCÍCIO 3 ---------------------------------------------
        System.out.println("EXIBIÇÃO DE PALAVRAS:");
        tree.exibe();
    }
    
}
