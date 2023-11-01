
package com.mycompany.doaki.upx.modelo.dominio;
import java.time.LocalDateTime;
public class Doacao {

    private int DoacaoId;
    private Long DoadorId;
    private Long UsuarioId;
    private  LocalDateTime DataHoraDoado;

    public Doacao() {
    }

    public Doacao(int DoacaoId, Long DoadorId, Long UsuarioId, LocalDateTime DataHoraDoado) {
        this.DoacaoId = DoacaoId;
        this.DoadorId = DoadorId;
        this.UsuarioId = UsuarioId;
        this.DataHoraDoado = DataHoraDoado;
    }

    public int getDoacaoId() {
        return DoacaoId;
    }

    public void setDoacaoId(int DoacaoId) {
        this.DoacaoId = DoacaoId;
    }

    public Long getDoadorId() {
        return DoadorId;
    }

    public void setDoadorId(Long DoadorId) {
        this.DoadorId = DoadorId;
    }

    public Long getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Long UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    public LocalDateTime getDataHoraDoado() {
        return DataHoraDoado;
    }

    public void setDataHoraDoado(LocalDateTime DataHoraDoado) {
        this.DataHoraDoado = DataHoraDoado;
    }
    
   
}
