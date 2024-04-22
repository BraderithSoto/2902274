package com.citas.java.entidades;

import java.time.LocalDateTime;

public class Cita {
    protected Paciente paciente;
    protected LocalDateTime fecha;
    
    public Cita(Paciente paciente, LocalDateTime fecha) {
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    }

    


