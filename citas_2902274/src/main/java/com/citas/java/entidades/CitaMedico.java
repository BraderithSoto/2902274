package com.citas.java.entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.EstadoCita;

//Implements: unicamente para "heredar" comportamientos
//pero solo INTERFACES

public class CitaMedico extends Cita implements IAgendamiento {

    private String motivo;
    private medico medico;
    private EstadoCita estadoCita;

public CitaMedico(Paciente paciente, LocalDateTime fecha, String motivo, com.citas.java.entidades.medico medico,
            EstadoCita estadoCita) {
    super(paciente, fecha);
    this.motivo = motivo;
    this.medico = medico;
    this.estadoCita = estadoCita.AGENDADA;
}

public String getMotivo() {
    return motivo;
}

public void setMotivo(String motivo) {
    this.motivo = motivo;
}

public medico getMedico() {
    return medico;
}

public void setMedico(medico medico) {
    this.medico = medico;
}

public EstadoCita getEstadoCita() {
    return estadoCita;
}

public void setEstadoCita(EstadoCita estadoCita) {
    this.estadoCita = estadoCita;
}

@Override
public void agendarCita(LocalDateTime fechaCita) {
    this.setFecha(fechaCita);
    this.setEstadoCita(EstadoCita.AGENDADA);
}

@Override
public void cancelarCita() {
    this.estadoCita = EstadoCita.CANCELADA;
    System.out.println("Cita con medico:" + medico.getNombre () + "cancelada");
}

@Override
public void reagendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);    
}

@Override
public String toString() {
    return "CitaMedico [Paciente" + 
                        getPaciente().getNombre() + 
                        " " + 
                        getPaciente().getApellido() + 
                         "Fecha " + getFecha() + 
                         "Medico " + getMedico().getNombre()+
                         "" +
                         getPaciente().getNombre() + 
                         " " + 
                         getPaciente().getApellido() +  "]";

}




}
