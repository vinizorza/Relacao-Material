package com.vztech.relacaomaterial.repository;

import com.vztech.relacaomaterial.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
    @Query(value = "SELECT m FROM Material m WHERE m.descricao LIKE %?1%")
    List<Material> findByDescricao(String descricao);
}
