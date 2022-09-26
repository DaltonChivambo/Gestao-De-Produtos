
package com.mycompany.gestaoproduto;

import java.io.IOException;


public class Menu {
    
    Fila fila = new Fila();
    Validacao val = new Validacao();

    public Menu(){

    }

    public void adicionaProduto() throws IOException {
        String nome = val.valString(4,45,"o nome do produto:");
        int codigo = val.valInt(1000,9999,"o codigo: ");
        String categoria = val.valString(4,45,"a categoria: ");

        Produto produto = new Produto(nome,codigo,categoria);
        fila.adiciona(produto);
    }

    public void gestaoProduto() throws IOException {
        int op;
        do {
            System.out.println("----------- Gestao de Comercio -----------");
            System.out.println( "\n{1} Adicionar Produtos"+
                                "\n{2} Exiber Produtos"+
                                "\n{3} Excluir Produtos"+
                                "\n{4}Sair");
            op = val.valInt(1,10,"A opção desejada:");
            switch (op){
                case 1: adicionaProduto(); break;
                case 2: fila.exibe();break;
                case 3: fila.remove();break;
                case 4: System.out.println("Saiu com Exito");break;
                default:
                    System.err.println("Opção Invalida!!! Escolha novamente!");
            }
        }while(op!=1&&op!=2&&op!=3&&op!=4);
    }
}
