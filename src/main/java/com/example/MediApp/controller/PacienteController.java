package com.example.MediApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MediApp.model.Paciente;
import com.example.MediApp.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService){
        this.pacienteService=pacienteService;
    }

    @GetMapping
    public List<Paciente> getAllPacientes(){
        return pacienteService.findAll();
    }

    @PostMapping
    public ResponseEntity<Paciente> createPaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.save(paciente));
    }

}
