package com.prolis.usuario.service.impl.impl;
import com.prolis.usuario.entity.usuario;
import com.prolis.usuario.repository.UsuarioRepository;
import com.prolis.usuario.service.impl.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Override
    public usuario listarPorId(Long id) {
        Optional<usuario> optionalResultados = usuarioRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

}
