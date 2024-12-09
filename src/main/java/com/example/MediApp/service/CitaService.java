package com.example.MediApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MediApp.model.Cita;
import com.example.MediApp.repository.CitaRepository;

@Service
public class CitaService {
    private final CitaRepository citaRepository;

    public CitaService(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
    }

    public List<Cita> finAll(){
        return citaRepository.findAll();
    }

    public Cita save(Cita cita){
        return citaRepository.save(cita);
    }
}
