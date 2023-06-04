package com.prolis.orden.service;


import com.prolis.orden.entity.Orden;

import java.util.List;

public interface OrdenService {
    Orden listarPorId(Long id);
    List<Orden> obtenerOrdenes();
    List<Orden> findByidTipoOrden(Long id);
}
