package com.example.MediApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MediApp.model.Medico;
import com.example.MediApp.service.MedicoService;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {
    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService){
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> getAllMedicos(){
        return medicoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Medico> createMedico(@RequestBody Medico medico){
        return ResponseEntity.ok(medicoService.save(medico));
    }
}
