package com.apirest.veiculo.service;

import com.apirest.veiculo.model.Veiculo;

import java.util.List;

public interface VeiculoService {
    List<Veiculo> listarVeiculos();
    Veiculo buscarVeiculoporId(Long id);

}

