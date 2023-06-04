package com.prolis.examen.controller;
import com.prolis.examen.entity.Examen;
import com.prolis.examen.service.ExamenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/examenes")
public class examenController {
    private ExamenService px_service;

    // http://localhost:8082/api/examenes
    @GetMapping
    public ResponseEntity<List<Examen>> listarExamenes(){
        List<Examen> pxs = px_service.obtenerResultados();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    //localhost:8082/api/examenes/examenById/{id}
    @GetMapping(path="/examenById/{id}")
    public ResponseEntity<Examen> obtenerPxPorId(@PathVariable("id") Long id)
    {
        Examen px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @GetMapping(path="/AreaExamen/{id}")
    public ResponseEntity<List<Examen>> obtenerOrdenPorIdCategoriaExamen(@PathVariable("id") Long id) {
        List<Examen> categoria = px_service.findByidAreaLabExamen(id);
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }
}
