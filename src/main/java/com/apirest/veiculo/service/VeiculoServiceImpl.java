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

    @Override
    public Veiculo salvaVeiculo(Veiculo veiculo) {
        return repository.save(veiculo);
    }

   @Override
    public Veiculo atualizarVeiculoporId(Long id, Veiculo veiculo) {
        return repository.findById(id)
                .map(search -> search = Veiculo.builder()
                .id(veiculo.getId())
                .ano(veiculo.getAno())
                .fabricante(veiculo.getFabricante())
                .modelo(veiculo.getModelo())
                .placa(veiculo.getPlaca()).build())
                .orElseThrow(() -> new RuntimeException());
    }

    @Override
    public void deletaVeiculo(Long id) {
        repository.deleteById(id);

    }
}
