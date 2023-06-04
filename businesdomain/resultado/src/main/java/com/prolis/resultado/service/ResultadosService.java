package com.prolis.resultado.service;

import com.prolis.resultado.entity.Resultados;

import java.util.List;

public interface ResultadosService {

    Resultados crearResultado(Resultados r);
    Resultados listarPorId(Long id);
    List<Resultados> obtenerResultados();
    Resultados actualizarResultado(Resultados r);
    void eliminarResultado(Long id);
    List<Resultados> findByidExamen(Long id);
    List<Resultados> findByidOrden(Long id);
    List<Resultados> findByidOrdenes(List<Integer> ids);
    List<Resultados> findByidExamenes(List<Integer> ids);
}
