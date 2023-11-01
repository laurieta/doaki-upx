
package com.mycompany.doaki.upx.modelo.dominio;

public class Doador {
    private Long DoadorId;
    private String nome;
    private String cpf;
    private String telefone;

    public Doador() {
    }

    public Doador(Long DoadorId, String nome, String cpf, String telefone) {
        this.DoadorId = DoadorId;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Long getDoadorId() {
        return DoadorId;
    }

    public void setDoadorId(Long DoadorId) {
        this.DoadorId = DoadorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
