package com.example.MediApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MediApp.model.Hora;
import com.example.MediApp.repository.HoraRepository;

@Service
public class HoraService {
    private final HoraRepository horaRepository;

    public HoraService(HoraRepository horaRepository){
        this.horaRepository= horaRepository;
    }

    public List<Hora> findAll(){
        return horaRepository.findAll();
    }

    public Hora save(Hora hora){
        return horaRepository.save(hora);
    }
}
