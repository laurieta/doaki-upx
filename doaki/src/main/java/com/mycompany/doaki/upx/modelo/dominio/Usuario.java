
package com.mycompany.doaki.upx.modelo.dominio;

public class Usuario {
    private int usuarioid;
    private String nome; 
    private Perfil perfil;
    private String usuario;
    private String senha;
    private boolean estado; 

    public Usuario() {
        this.estado = true;
    }

    public Usuario(int id, String nome, Perfil perfil, String usuario, String senha) {
        this.usuarioid = usuarioid;
        this.nome = nome;
        this.perfil = perfil;
        this.usuario = usuario;
        this.senha = senha;
        this.estado = true;
    }

    public int getId() {
        return usuarioid;
    }

    public void setId(int id) {
        this.usuarioid = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.usuarioid;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.usuarioid == other.usuarioid;
    }
    
    public void reset(){
        this.estado = true;
    }
    public void mudarEstado(){
      this.estado = !this.estado;
    }
        
   
    
}
