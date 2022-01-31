package com.apirest.veiculo.controller;

import com.apirest.veiculo.model.Veiculo;
import com.apirest.veiculo.service.VeiculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class VeiculoController {

    private VeiculoService service;

    @GetMapping("/veiculos")
    public List<Veiculo> listaVeiculos(){
        return service.listarVeiculos();
    }

    @GetMapping("/veiculo{id}")
    public Veiculo listaVeiculoporId (@PathVariable("id") Long id){
        return service.buscarVeiculoporId(id);
    }


}
