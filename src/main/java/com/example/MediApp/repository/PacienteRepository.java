package com.example.MediApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MediApp.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
