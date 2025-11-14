package com.example.savings.service;

import com.example.savings.modelo.Meta;
import com.example.savings.modelo.Meta;
import com.example.savings.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
@Service
public class MetaService {
    private final MetaRepository repo;
    public MetaService(MetaRepository repo) {
        this.repo = repo;
    }
    public List<Meta> obtener () { return repo.findAll();}
    public Optional<Meta> obtenerPorId(Long id){return repo.findById(id);}
    public Meta guardar(Meta meta){return repo.save(meta);}
    public void eliminar(Long id) {repo.deleteById(id);}
}
