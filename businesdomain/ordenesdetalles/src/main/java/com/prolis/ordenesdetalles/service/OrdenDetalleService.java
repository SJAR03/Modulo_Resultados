package com.prolis.ordenesdetalles.service;
import com.prolis.ordenesdetalles.entity.OrdenDetalle;

import java.util.List;

public interface OrdenDetalleService {
    OrdenDetalle listarPorId(Long id);
    List<OrdenDetalle> obtenerDetalles();
    List<OrdenDetalle> findByidOrden(Long id);
}
