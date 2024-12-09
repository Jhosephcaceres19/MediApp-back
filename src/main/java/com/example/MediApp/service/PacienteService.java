package com.example.MediApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MediApp.model.Paciente;
import com.example.MediApp.repository.PacienteRepository;

@Service
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}
