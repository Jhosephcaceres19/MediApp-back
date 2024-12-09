package com.example.MediApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MediApp.model.Hora;
import com.example.MediApp.service.HoraService;

@RestController
@RequestMapping("/api/horas")
public class HoraController {
    private final HoraService horaService;

    public HoraController(HoraService horaService){
        this.horaService = horaService;
    }

    @GetMapping
    public List<Hora> getAllHoras(){
        return horaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Hora> createHora(@RequestBody Hora hora){
        return ResponseEntity.ok(horaService.save(hora));
    }

}
