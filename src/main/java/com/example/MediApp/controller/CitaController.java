package com.example.MediApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MediApp.model.Cita;
import com.example.MediApp.service.CitaService;

@RestController
@RequestMapping("/api/cita")
public class CitaController {
    private final CitaService citaService;

    public CitaController(CitaService citaService){
        this.citaService = citaService;
    }

    @GetMapping
    public List<Cita> getAllCitas(){
        return citaService.finAll();
    }

    @PostMapping
    public ResponseEntity< Cita> createCita(@RequestBody Cita cita){
        return ResponseEntity.ok(citaService.save(cita));
    }

}
