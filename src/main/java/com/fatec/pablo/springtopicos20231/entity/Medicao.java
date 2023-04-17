package com.fatec.pablo.springtopicos20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mdc_medicao")
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mdc_id")
    private Long id;

    @Column(name = "mdc_data_hora")
    private LocalDateTime data_hora;

    @Column(name = "mdc_temperatura")
    private Float temperatura;

    @Column(name = "mdc_umidade")
    private Float umidade;

    @Column(name = "mdc_particulas")
    private Float particulas;

    @Column(name = "mdc_status")
    private String status;

    @Column(name = "mdc_data_processamento")
    private LocalDateTime data_processamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getUmidade() {
        return umidade;
    }

    public void setUmidade(Float umidade) {
        this.umidade = umidade;
    }

    public Float getParticulas() {
        return particulas;
    }

    public void setParticulas(Float particulas) {
        this.particulas = particulas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getData_processamento() {
        return data_processamento;
    }

    public void setData_processamento(LocalDateTime data_processamento) {
        this.data_processamento = data_processamento;
    }

    public Medicao() {}

    public Medicao (
        LocalDateTime data_hora,
        float temperatura,
        float umidade,
        float particulas,
        String status,
        LocalDateTime data_processamento
    ) {
        this.data_hora = data_hora;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.particulas = particulas;
        this.status = status;
        this.data_processamento = data_processamento;
    }
}
