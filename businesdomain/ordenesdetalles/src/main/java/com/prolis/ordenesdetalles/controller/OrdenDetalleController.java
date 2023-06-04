package com.prolis.ordenesdetalles.controller;
import com.prolis.ordenesdetalles.entity.OrdenDetalle;
import com.prolis.ordenesdetalles.service.OrdenDetalleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/ordenesdetalle")
public class OrdenDetalleController {
    private OrdenDetalleService px_service;

    // http://localhost:8085/api/ordenesdetalle
    @GetMapping
    public ResponseEntity<List<OrdenDetalle>> listarOrdenes(){
        List<OrdenDetalle> pxs = px_service.obtenerDetalles();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    //localhost:8082/api/ordenesdetalle/ordendetalleById/{id}
    @GetMapping(path="/ordenesdetalleById/{id}")
    public ResponseEntity<OrdenDetalle> obtenerOrdenPorId(@PathVariable("id") Long id)
    {
        OrdenDetalle px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @GetMapping(path="/orden/{id}")
    public ResponseEntity<List<OrdenDetalle>> obtenerOrdenPorIdTipoOrden(@PathVariable("id") Long id) {
        List<OrdenDetalle> orden = px_service.findByidOrden(id);
        return new ResponseEntity<>(orden, HttpStatus.OK);
    }
}
