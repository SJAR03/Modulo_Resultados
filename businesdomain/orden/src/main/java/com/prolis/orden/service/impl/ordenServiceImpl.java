package com.prolis.orden.service.impl;


import com.prolis.orden.entity.Orden;
import com.prolis.orden.repository.OrdenRepository;
import com.prolis.orden.service.OrdenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ordenServiceImpl implements OrdenService {
    @Autowired
    private final OrdenRepository OrdenRepository;


    @Override
    public Orden listarPorId(Long id) {
        Optional<Orden> optionalResultados = OrdenRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Orden> obtenerOrdenes() {
        return OrdenRepository.findAll();
    }

    @Override
    public List<Orden> findByidTipoOrden(Long id) {
        return OrdenRepository.findByIdTipoOrden(id);
    }
}
