package com.vztech.relacaomaterial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Projeto {

    @Id
    private String nome;

    @ManyToMany
    private List<Poste> postes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Poste> getPostes() {
        return postes;
    }

    public void setPostes(List<Poste> postes) {
        this.postes = postes;
    }
}
