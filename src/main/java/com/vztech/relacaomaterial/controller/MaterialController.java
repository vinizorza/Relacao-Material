package com.vztech.relacaomaterial.controller;

import com.vztech.relacaomaterial.entity.Material;
import com.vztech.relacaomaterial.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/material")
public class MaterialController {

    @Autowired
    MaterialRepository materialRepository;

    @GetMapping("/list")
    public List<Material> list(){
//        return materialRepository.findAll();

        return materialRepository.findByDescricao("teste");
    }
}
