package com.apirest.veiculo.controller;

import com.apirest.veiculo.model.Veiculo;
import com.apirest.veiculo.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class VeiculoController {

    private VeiculoService service;

    @GetMapping("/veiculos")
    public List<Veiculo> listaVeiculos() {
        return service.listarVeiculos();
    }
    @GetMapping("/veiculo{id}")
    public Veiculo listaVeiculoporId(@PathVariable("id") Long id) {
        return service.buscarVeiculoporId(id);
    }
    @PostMapping("/veiculo/")
    public Veiculo salvarVeiculo(@RequestBody Veiculo veiculo){
        return service.salvaVeiculo(veiculo);
    }
    @PutMapping("/veiculo/{id}")
    public Veiculo atualizarVeiculo(@PathVariable ("id") long id, @RequestBody Veiculo veiculo){
        return service.atualizarVeiculoporId(id,veiculo);
    }
    @DeleteMapping("/veiculo")
    public void deletaVeiculo(@RequestBody Veiculo veiculo){

    }
}
