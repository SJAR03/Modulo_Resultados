package com.prolis.examen.service;

import com.prolis.examen.entity.Examen;

import java.util.List;

public interface ExamenService {
    Examen listarPorId(Long id);
    List<Examen> obtenerResultados();
    List<Examen> findByidAreaLabExamen(Long id);
}
