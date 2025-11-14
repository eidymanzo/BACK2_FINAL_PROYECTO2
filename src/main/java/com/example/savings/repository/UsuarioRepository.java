package com.example.savings.repository;

import com.example.savings.modelo.Usuario;



import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}

