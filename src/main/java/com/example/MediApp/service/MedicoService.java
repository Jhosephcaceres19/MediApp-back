package com.example.MediApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MediApp.model.Medico;
import com.example.MediApp.repository.MedicoRepository;

@Service
public class MedicoService {
    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository){
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }

    public Medico save(Medico medico){
        return medicoRepository.save(medico);
    }

}
