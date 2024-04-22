package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public class Enfermero {

    public Integer id;
    public String nombre;
    public String apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long RegistroMedico;

    public Enfermero(Integer id, 
            String nombre, 
            String apellido, 
            TipoDocumento tipoDocumento,
            Long i,
            Long registroMedico) 
            {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = i;
        RegistroMedico = registroMedico;
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

    
}
