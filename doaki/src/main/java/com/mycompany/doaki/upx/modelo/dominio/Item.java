
package com.mycompany.doaki.upx.modelo.dominio;

public class Item {
    private Long itemid;
    private String nome;
    private Long quantidade;
    private int categoria;

    public Item() {
    }

    public Item(Long id, String nome, Long quantidade, int categoria) {
        this.itemid = itemid;
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Long getId() {
        return itemid;
    }

    public void setId(Long id) {
        this.itemid = itemid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
    
}
