package com.example.savings.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int ahorro;
    private int ingresos;
    private int gastos;

    @ManyToMany
    @JoinTable(
            name = "cuentas_usuarios",
            joinColumns = @JoinColumn(name = "fk_id_cuenta"),
            inverseJoinColumns = @JoinColumn(name = "fk_id_usuario"))
    private Set<Usuario> usuarios;


}