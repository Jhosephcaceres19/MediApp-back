package com.example.MediApp.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column
    private String detalle;
    
    @Enumerated(EnumType.STRING)
    @Column
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    @JsonBackReference
    private Paciente paciente;


    public enum Estado{
        Pendiente,
        Confirmada,
        Cancelada
    }
}
