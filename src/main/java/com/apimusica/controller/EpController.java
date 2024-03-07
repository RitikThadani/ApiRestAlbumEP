package com.apimusica.controller;

import java.util.ArrayList;
import java.util.List;

import com.apimusica.repositories.EpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apimusica.model.Ep;
import com.apimusica.services.EpService;

@RestController
@RequestMapping("/api")
public class EpController {

    @Autowired
    private EpService epService;

    @Autowired
    private EpRepository epRepository;

    // GET sin parámetros
    @GetMapping("/")
    public ArrayList<Ep> getAllEpss() {
        return epService.getAllEps();
    }

    // GET con Path Variable
//    @GetMapping("/{id}")
//    public Ep getEpById(@PathVariable String id) {
//        return epService.findById(id).orElse(null);
//    }

    // Método GET para obtener todos los libros
    @GetMapping("/eps")
    public ArrayList<Ep> getAllEps() {
        return epService.getAllEps();
    }

    // POST
    @PostMapping("/")
    public Ep createEp(@RequestBody Ep ep) {
        return epRepository.save(ep);
    }

    // DELETE
    @DeleteMapping("/{nombre}")
    public void deleteEpByNombre(@PathVariable("nombre") String nombre){
        epService.deleteEpByNombre(nombre);
    }
}
