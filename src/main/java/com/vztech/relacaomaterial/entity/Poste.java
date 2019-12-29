package com.vztech.relacaomaterial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Poste {

    @Id
    private Integer codigo;
    private String nome;

    @ManyToMany
    private List<Estrutura> estruturas;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estrutura> getEstruturas() {
        return estruturas;
    }

    public void setEstruturas(List<Estrutura> estruturas) {
        this.estruturas = estruturas;
    }
}
