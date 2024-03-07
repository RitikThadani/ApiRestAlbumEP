package com.apimusica.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.apimusica.model.Ep;
import com.apimusica.repositories.EpRepository;
import org.springframework.stereotype.Service;

@Service
public class EpService {
    @Autowired
    private EpRepository epRepository;

    // Método para obtener todos los eps
    public ArrayList<Ep> getAllEps() {
        return epRepository.findAll();
    }

    public Ep createEp(Ep ep) {
        return epRepository.save(ep);
    }

    public void deleteEpByNombre(String nombre){
        epRepository.deleteByNombre(nombre);
    }
}
