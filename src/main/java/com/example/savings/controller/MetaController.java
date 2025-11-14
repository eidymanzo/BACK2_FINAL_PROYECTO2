package com.example.savings.controller;

import java.util.List;
import com.example.savings.modelo.Meta;
import com.example.savings.service.MetaService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/metas")
@CrossOrigin
@Tag(name = "MetaController", description = "Controlador de ejemplo con todos los métodos HTTP")

public class MetaController {
    private final MetaService service;

    public MetaController(MetaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Meta> list() { return service.obtener(); }

    @GetMapping("/{id}")
    public Meta get(@PathVariable Long id) { return service.obtenerPorId(id).orElseThrow(); }

    @PostMapping
    public Meta save(@RequestBody Meta meta) { return service.guardar(meta); }

    @PatchMapping("/{id}")
    public Meta update(@PathVariable Long id, @RequestBody Meta meta) {
        meta.setId(id);
        return service.guardar(meta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminar(id); }
}
