package com.apimusica.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apimusica.model.Ep;

public interface EpRepository extends MongoRepository<Ep,String>{

    public abstract ArrayList<Ep> findAll();

    Ep save(Ep ep);

    public abstract void deleteByNombre(String nombre);
}
