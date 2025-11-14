package com.example.savings.modelo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Schema(description = "Nombre de la persona", example = "Juan")
    private String nombre;
    @Schema(description = "Apellidos de la persona", example = "Pérez Gómez")
    private String apellido;
    @Schema(description = "email de la persona", example = "ab123@ab.com")
    private String email;
    @Schema(description = "número de teléfono", example = "123456789")
    private String telefono;
    @Schema(description = "Nombre del usuario", example = "Pérez Gómez")
    private String nombreUsuario;
    @Schema(description = "contraseña del usuario", example = "abcd1234")
    private String password;


    @ManyToMany(mappedBy = "usuarios")
    private Set<Cuenta> cuentas;

}