package com.prolis.usuario.service.impl;
import com.prolis.usuario.entity.usuario;

import java.util.List;
public interface UsuarioService {
    usuario listarPorId(Long id);
    List<usuario> obtenerUsuarios();
}

