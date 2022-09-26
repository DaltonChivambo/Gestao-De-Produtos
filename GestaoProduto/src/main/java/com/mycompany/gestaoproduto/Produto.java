
package com.mycompany.gestaoproduto;


public class Produto {
    
    private String nome;
    private int codigo;
    private String categoria;

    public Produto(String nome, int codigo, String categoria) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "{"+"Nome:"+nome + "\tCodigo:"+codigo+"\tCategoria:"+categoria+"}";
    }
}
