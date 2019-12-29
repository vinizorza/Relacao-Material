package com.vztech.relacaomaterial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Estrutura {

    @Id
    private Integer codigo;
    private String nome;

    @ManyToMany
    private List<Material> materiais;

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

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
}
