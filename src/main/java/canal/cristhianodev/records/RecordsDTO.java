package canal.cristhianodev.records;

import java.util.Date;

public class RecordsDTO {
    private Long id;
    private Date dt_hora;
    private Float velocidade;
    private String placa;
    private String classe_veiculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDt_hora() {
        return dt_hora;
    }

    public void setDt_hora(Date dt_hora) {
        this.dt_hora = dt_hora;
    }

    public Float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Float velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getClasse_veiculo() {
        return classe_veiculo;
    }

    public void setClasse_veiculo(String classe_veiculo) {
        this.classe_veiculo = classe_veiculo;
    }
}

