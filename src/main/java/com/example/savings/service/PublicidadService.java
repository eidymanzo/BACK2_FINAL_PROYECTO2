package com.example.savings.service;

import com.example.savings.modelo.Meta;
import com.example.savings.modelo.Publicidad;
import com.example.savings.repository.PublicidadRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PublicidadService {
    private final PublicidadRepository repopublic;

    public PublicidadService(PublicidadRepository repopublic) {
        this.repopublic = repopublic;
    }

    public List<Publicidad> obtenerTodos() {
        return repopublic.findAll();
    }

    public Optional<Publicidad> obtenerPorId(String id) {
        return repopublic.findById(id);
    }

    public Publicidad guardar(Publicidad publicidad) {
        return repopublic.save(publicidad);
    }

    public void eliminarId(String id) {
        repopublic.deleteById(id);
    }

}