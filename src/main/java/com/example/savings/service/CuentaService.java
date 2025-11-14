package com.example.savings.service;


import com.example.savings.modelo.Cuenta;
import com.example.savings.modelo.Cuenta;
import com.example.savings.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
@Service
public class CuentaService {
    private final CuentaRepository repo;
    public CuentaService(CuentaRepository repo) {
        this.repo = repo;
    }
    public List<Cuenta> obtener () { return repo.findAll();}
    public Optional<Cuenta> obtenerPorId(Long id){return repo.findById("Long id");}
    public Cuenta guardar(Cuenta cuenta){return repo.save(cuenta);}

    public void eliminar(Long id) {repo.deleteById("Long id");}
}