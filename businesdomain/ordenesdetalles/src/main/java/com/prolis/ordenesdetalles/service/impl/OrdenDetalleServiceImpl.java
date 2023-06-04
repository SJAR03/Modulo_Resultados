package com.prolis.ordenesdetalles.service.impl;
import com.prolis.ordenesdetalles.entity.OrdenDetalle;
import com.prolis.ordenesdetalles.repository.ordenDetalleRepository;
import com.prolis.ordenesdetalles.service.OrdenDetalleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class OrdenDetalleServiceImpl implements OrdenDetalleService {
    @Autowired
    private final ordenDetalleRepository OrdenDetalleRepository;


    @Override
    public OrdenDetalle listarPorId(Long id) {
        Optional<OrdenDetalle> optionalResultados = OrdenDetalleRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<OrdenDetalle> obtenerDetalles() {
        return OrdenDetalleRepository.findAll();
    }

    @Override
    public List<OrdenDetalle> findByidOrden(Long id) {
        return OrdenDetalleRepository.findByIdOrden(id);
    }
}