package com.prolis.resultado.service.impl;

import com.prolis.resultado.entity.Resultados;
import com.prolis.resultado.repository.ResultadosRepository;
import com.prolis.resultado.service.ResultadosService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ResultadosServiceImpl implements ResultadosService {

    @Autowired
    private final ResultadosRepository resultadosRepository;

    @Override
    public Resultados crearResultado(Resultados r) {
        if (r.getIdResultados() != null) {
            throw new IllegalArgumentException("No se puede asignar un ID al crear un nuevo resultado");
        }
      //  List<Resultados> ordenesOcupadas = resultadosRepository.findByIdOrden((long) r.getIdOrden());
     //   if (!ordenesOcupadas.isEmpty()) {
      //      throw new IllegalArgumentException("Ya existe un resultado para esa orden");
       // }

        return resultadosRepository.save(r);
    }
    @Override
    public Resultados listarPorId(Long id) {
        Optional<Resultados> optionalResultados = resultadosRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Resultados> obtenerResultados() {
        return resultadosRepository.findAll();
    }

    @Override
    public Resultados actualizarResultado(Resultados r) {
        Resultados existe = resultadosRepository.findById(r.getIdResultados()).get();
        existe.setIdExamen(r.getIdExamen());
        existe.setIdOrden(r.getIdOrden());
        existe.setResultado(r.getResultado());
        existe.setObservaciones(r.getObservaciones());
        existe.setProcesado(r.getProcesado());
        existe.setFechaProcesa(r.getFechaProcesa());
        existe.setIdUsuarioProcesa(r.getIdUsuarioProcesa());
        existe.setProcesado(r.getProcesado());
        existe.setValidado(r.getValidado());
        existe.setFechaValida(r.getFechaValida());
        existe.setIdUsuarioValida(r.getIdUsuarioValida());
        existe.setImpreso(r.getImpreso());
        existe.setFechaImprime(r.getFechaImprime());
        existe.setIdUsuarioImprime(r.getIdUsuarioImprime());
        existe.setEstado(r.getEstado());

        return resultadosRepository.save(existe);
    }

    @Override
    public void eliminarResultado(Long id) {
        resultadosRepository.deleteById(id);
    }
    @Override
    public List<Resultados> findByidExamen(Long id) {
        return resultadosRepository.findByIdExamen(id);
    }
    @Override
    public List<Resultados> findByidOrden(Long id) {return resultadosRepository.findByIdOrden(id); }
    @Override
    public List<Resultados> findByidOrdenes(List<Integer> ids) {
        return resultadosRepository.findByIdOrdenIn(ids);
    }
    @Override
    public List<Resultados> findByidExamenes(List<Integer> ids) {return resultadosRepository.findByIdExamenIn(ids);
    }
}
