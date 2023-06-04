package com.prolis.examen.repository;
import com.prolis.examen.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
    List<Examen> findByIdAreaLabServicio(Long idAreaLabServicio);
}
