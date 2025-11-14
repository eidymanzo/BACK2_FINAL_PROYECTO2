package com.example.savings.controller;

import java.util.List;
import com.example.savings.modelo.Usuario;
import com.example.savings.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin
@Tag(name = "UsuariosController", description = "Controlador de ejemplo con todos los métodos HTTP")

public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> list() { return service.obtener(); }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id) { return service.obtenerPorId(id).orElseThrow(); }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) { return service.guardar(usuario); }

    @PatchMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return service.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminar(id); }
}
