package com.example.savings.service;


import com.example.savings.modelo.Usuario;
import com.example.savings.modelo.Usuario;
import com.example.savings.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }
    public List<Usuario> obtener () { return repo.findAll();}
    public Optional<Usuario> obtenerPorId(Long id){return repo.findById(id);}
    public Usuario guardar(Usuario usuario){return repo.save(usuario);}
    public void eliminar(Long id) {repo.deleteById(id);}
}

