package com.example.demo.controllers;
import com.example.demo.services.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class controler {
    @Autowired
    Services usuarioService;
    @GetMapping(path="/{id}")
    public String obtenerPorPrioridad(@PathVariable("id") long id){
        return  usuarioService.valorFactura(id);
    } 
}
