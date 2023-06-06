package com.prolis.usuario.controller;
import com.prolis.usuario.entity.usuario;
import com.prolis.usuario.service.impl.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/usuario")
public class UsuarioController {
    private UsuarioService px_service;

    // http://localhost:8082/api/usuario
    @GetMapping
    public ResponseEntity<List<usuario>> listarUsuarios(){
        List<usuario> pxs = px_service.obtenerUsuarios();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }
    //localhost:8082/api/usuario/usuarioById/{id}
    @GetMapping(path="/usuarioById/{id}")
    public ResponseEntity<usuario> obtenerPxPorId(@PathVariable("id") Long id)
    {
        usuario px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }
}
