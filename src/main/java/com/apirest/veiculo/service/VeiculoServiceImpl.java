package com.apirest.veiculo.service;

import com.apirest.veiculo.model.Veiculo;
import com.apirest.veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    @Override
    public List<Veiculo> listarVeiculos(){
        return repository.findAll();
    }

    @Override
    public Veiculo buscarVeiculoporId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
