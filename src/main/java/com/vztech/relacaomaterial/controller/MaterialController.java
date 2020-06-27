package com.vztech.relacaomaterial.controller;

import com.vztech.relacaomaterial.entity.Material;
import com.vztech.relacaomaterial.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/material")
public class MaterialController {

    @Autowired
    MaterialRepository materialRepository;

    @GetMapping("/list")
    public List<Material> list(){
        return materialRepository.findAll();
    }

    @RequestMapping("/listByDescricao")
    public Material deletarEvento(String descricao){
        return (Material) materialRepository.findByDescricao(descricao);
    }

    @RequestMapping(value="/{codigo}", method= RequestMethod.GET)
    public Optional<Material> getMaterial(@PathVariable("codigo") int codigo){
        return materialRepository.findById(codigo);
    }
}
