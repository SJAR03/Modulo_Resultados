package com.prolis.valoresnormales.service.impl;

import com.prolis.valoresnormales.entity.Valoresnormales;
import com.prolis.valoresnormales.repository.ValoresnormalesRepository;
import com.prolis.valoresnormales.service.ValoresnormalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ValoresnormalesServiceImpl implements ValoresnormalesService {

    @Autowired
    private final ValoresnormalesRepository ValoresnormalesRepository;


    @Override
    public Valoresnormales listarPorId(Long id) {
        Optional<Valoresnormales> optionalResultados = ValoresnormalesRepository.findById(id);
        return optionalResultados.orElse(null);
    }
    @Override
    @Transactional(readOnly = true)
    public List<Valoresnormales> obtenerValoresnormales() {
        return ValoresnormalesRepository.findAll();
    }



}
