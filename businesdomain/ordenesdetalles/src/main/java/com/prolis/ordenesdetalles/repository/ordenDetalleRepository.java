package com.prolis.ordenesdetalles.repository;
import com.prolis.ordenesdetalles.entity.OrdenDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ordenDetalleRepository extends JpaRepository<OrdenDetalle, Long> {
    List<OrdenDetalle> findByIdOrden(Long idOrden);
}
