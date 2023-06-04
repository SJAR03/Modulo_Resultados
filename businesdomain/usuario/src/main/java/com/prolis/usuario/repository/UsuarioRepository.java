package com.prolis.usuario.repository;
import com.prolis.usuario.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {
}
