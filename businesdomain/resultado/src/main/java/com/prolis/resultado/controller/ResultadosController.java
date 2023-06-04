package com.prolis.resultado.controller;

import com.prolis.resultado.entity.Resultados;
import com.prolis.resultado.service.ResultadosService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/resultados")
public class ResultadosController {

    private ResultadosService px_service;

    // http://localhost:8082/api/resultados
    @GetMapping
    public ResponseEntity<List<Resultados>> listarResultados(){
        List<Resultados> pxs = px_service.obtenerResultados();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }
    // http://localhost:8086/api/resultados/add
    @PostMapping(path="/add")
    public ResponseEntity<Resultados> crearResultado(@RequestBody Resultados r){
        Resultados px = px_service.crearResultado(r);
        return new ResponseEntity<>(px, HttpStatus.CREATED);
    }

    // http://localhost:8082/api/resultados/resultadoById/{id}
    @GetMapping(path="/resultadoById/{id}")
    public ResponseEntity<Resultados> obtenerPxPorId(@PathVariable("id") Long id)
    {
        Resultados px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Resultados> actualizarResultado(@PathVariable("id") Long id, @RequestBody Resultados input)
    {
        input.setIdResultados(id);
        Resultados px = px_service.actualizarResultado(input);
        return new ResponseEntity<>(px, HttpStatus.OK);

    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminarRx(@PathVariable("id") Long id)
    {
        px_service.eliminarResultado(id);
        return new ResponseEntity<>("Paciente eliminado correctamente!!", HttpStatus.OK);
    }
    // http://localhost:8082/api/resultados/examen/{id}
    @GetMapping(path="/examen/{id}")
    public ResponseEntity<List<Resultados>> obtenerResultadosPorIdExamen(@PathVariable("id") Long id) {
        List<Resultados> resultados = px_service.findByidExamen(id);
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }

    //  http://localhost:8082/api/resultados/orden/{id}
    @GetMapping(path="/orden/{id}")
    public ResponseEntity<List<Resultados>> obtenerResultadosPorIdOrden(@PathVariable("id") Long id) {
        List<Resultados> resultados = px_service.findByidOrden(id);
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }

    @GetMapping(path="/ordenes/{ids}")
    public ResponseEntity<List<Resultados>> obtenerResultadosPorIdOrdenes(@PathVariable("ids") List<Integer> ids) {
        List<Resultados> resultados = px_service.findByidOrdenes(ids);
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }
    @GetMapping(path="/examenes/{ids}")
    public ResponseEntity<List<Resultados>> obtenerResultadosPorIdExamenes(@PathVariable("ids") List<Integer> ids) {
        List<Resultados> resultados = px_service.findByidExamenes(ids);
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }



}