package com.prolis.valoresnormales.controller;

import com.prolis.valoresnormales.entity.Valoresnormales;
import com.prolis.valoresnormales.service.ValoresnormalesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/valoresnormales")
public class ValoresnormalesController {
    private ValoresnormalesService px_service;

    // http://localhost:8088/api/Valoresnormales
    @GetMapping
    public ResponseEntity<List<Valoresnormales>> listarValoresnormales(){
        List<Valoresnormales> pxs = px_service.obtenerValoresnormales();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    //localhost:8088/api/valoresnormales/valoresnormalesbyId/{id}
    @GetMapping(path="/valoresnormales/{id}")
    public ResponseEntity<Valoresnormales> obtenerValoresnormalesPorId(@PathVariable("id") Long id)
    {
        Valoresnormales px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

}

