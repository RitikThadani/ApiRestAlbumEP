package com.apimusica.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ep")
public class Ep {
    
    private String nombre;
    private String artista;
    private List<String> canciones;

}
