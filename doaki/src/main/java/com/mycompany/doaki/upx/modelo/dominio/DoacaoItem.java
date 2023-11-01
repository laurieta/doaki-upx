
package com.mycompany.doaki.upx.modelo.dominio;

public class DoacaoItem {
    
    private Doacao doacao;
    private Item item;
    private int quantidade;

    public DoacaoItem() {
    }

    public DoacaoItem(Doacao doacao, Item item, int quantidade) {
        this.doacao = doacao;
        this.item = item;
        this.quantidade = quantidade;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
