package com.example.MediApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MediApp.model.Medico;

public interface MedicoRepository  extends JpaRepository<Medico, Long>{

}
