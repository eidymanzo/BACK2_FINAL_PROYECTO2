package com.example.savings.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "publicidad")
public class Publicidad {
    @Id
    private String id;
    private String mensaje;
    private String elementosVisuales;
    private String repeticion;
    private String impacto;


}