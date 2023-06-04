package com.prolis.examen.service.impl;

import com.prolis.examen.entity.Examen;
import com.prolis.examen.repository.ExamenRepository;
import com.prolis.examen.service.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private final ExamenRepository examenRepository;

    /*Solo de ejemplos*/

    @Override
    public Examen listarPorId(Long id) {
        Optional<Examen> optionalResultados = examenRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Examen> obtenerResultados() {
        return examenRepository.findAll();
    }


    @Override
    public List<Examen> findByidAreaLabExamen(Long id) {
        return examenRepository.findByIdAreaLabServicio(id);
    }

}
