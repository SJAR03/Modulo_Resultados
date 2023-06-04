package com.prolis.orden.controller;


import com.prolis.orden.entity.Orden;
import com.prolis.orden.service.OrdenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/ordenes")
public class OrdenController {
    private OrdenService px_service;

    // http://localhost:8082/api/ordenes
    @GetMapping
    public ResponseEntity<List<Orden>> listarOrdenes(){
        List<Orden> pxs = px_service.obtenerOrdenes();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    //localhost:8082/api/ordenes/ordenById/{id}
    @GetMapping(path="/orden/{id}")
    public ResponseEntity<Orden> obtenerOrdenPorId(@PathVariable("id") Long id)
    {
        Orden px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @GetMapping(path="/tipo/{id}")
    public ResponseEntity<List<Orden>> obtenerOrdenPorIdTipoOrden(@PathVariable("id") Long id) {
        List<Orden> orden = px_service.findByidTipoOrden(id);
        return new ResponseEntity<>(orden, HttpStatus.OK);
    }
}
