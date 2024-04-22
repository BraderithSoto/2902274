package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

public class medico {
//wrapper
    public Integer id;
    public String nombre;
    public String apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long RegistroMedico;
    public Especialidad especialidad;


    public medico(Integer id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        RegistroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public Long getNumeroDocumento() {
        return numeroDocumento;
    }


    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    public Long getRegistroMedico() {
        return RegistroMedico;
    }


    public void setRegistroMedico(Long registroMedico) {
        RegistroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return "medico [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getEspecialidad()="
                + getEspecialidad() + "]";
    }


    

}
