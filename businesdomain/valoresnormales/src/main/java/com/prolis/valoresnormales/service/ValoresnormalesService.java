package com.prolis.valoresnormales.service;

import com.prolis.valoresnormales.entity.Valoresnormales;

import java.util.List;
public interface ValoresnormalesService {
    Valoresnormales listarPorId(Long id);
    List<Valoresnormales> obtenerValoresnormales();

}
