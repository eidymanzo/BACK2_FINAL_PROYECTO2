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
@Table(name = "metas")
public class Meta {
    @Id
    private Long id;
    private double plazo;
    private double monto;
    private double limite;
    private double objetivo;
}