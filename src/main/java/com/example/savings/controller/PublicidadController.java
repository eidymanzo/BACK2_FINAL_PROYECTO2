package com.example.savings.controller;

import java.security.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.example.savings.modelo.Publicidad;
import com.example.savings.service.PublicidadService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/publicidad")
@CrossOrigin
@RestController
@Tag (name = "PublicidadController", description = "Controlador")
public class PublicidadController {


    private final  PublicidadService  service;

    public PublicidadController(PublicidadService service){
        this.service = service;
    }
    @GetMapping
    public List<Publicidad> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Publicidad> obtener(@PathVariable String id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Publicidad crear(@RequestBody Publicidad publicidad) {
        return service.guardar(publicidad);
    }

    @PatchMapping("/{id}")
    public Publicidad actualizar(@PathVariable String id, @RequestBody Publicidad publicidad) {
        publicidad.setId(id);
        return service.guardar(publicidad);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> eliminar(@PathVariable String id) {
        Map<String, String> r = new HashMap<String, String>();
        service.eliminarId(id);
        r.put("mensaje", "Documento eliminado correctamente");
        return r;
    }

}

