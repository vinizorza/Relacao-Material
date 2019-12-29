package com.vztech.relacaomaterial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Material.findByDescricao",
//            query = "SELECT m FROM Material WHERE ")
public class Material {

    @Id
    private Integer codigo;
    private String unidade;
    private String descricao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
