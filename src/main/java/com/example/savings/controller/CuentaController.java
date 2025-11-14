package com.example.savings.controller;

import java.util.List;
import com.example.savings.modelo.Cuenta;
import com.example.savings.service.CuentaService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuentas")
@CrossOrigin
@Tag(name = "CuentaController", description = "Controlador de ejemplo con todos los métodos HTTP")

public class CuentaController {
    private final CuentaService service;

    public CuentaController(CuentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cuenta> list() { return service.obtener(); }

    @GetMapping("/{id}")
    public Cuenta get(@PathVariable Long id) { return service.obtenerPorId(id).orElseThrow(); }

    @PostMapping
    public Cuenta save(@RequestBody Cuenta cuenta) { return service.guardar(cuenta); }

    @PatchMapping("/{id}")
    public Cuenta update(@PathVariable Long id, @RequestBody Cuenta cuenta) {
        cuenta.setId(id);
        return service.guardar(cuenta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.eliminar(id); }
}
