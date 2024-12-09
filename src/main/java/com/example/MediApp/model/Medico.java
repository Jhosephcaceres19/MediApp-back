package com.example.MediApp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "medico")
public class Medico {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Enumerated(EnumType.STRING)
    @Column(name = "especialidad")
    private Especialidad especialidad;
    @Column(name = "numeroLicencia")
    private String numeroLicencia;
    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Hora> horas;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<Cita> citas;

    public enum Especialidad{
        Cirujano,
        Pediatra,
        Otros,
    }

}
