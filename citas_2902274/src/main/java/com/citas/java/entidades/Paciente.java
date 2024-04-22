package com.citas.java.entidades;

import java.time.LocalDate;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;


public class Paciente {

    @Override
    public String toString() {
        return "Paciente [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + "]";
    }




    public Integer id;
    public String nombre;
    public String apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public String correoElectronico;
    public Integer celular;
    public LocalDate fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    


    public Paciente(Integer id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            String correoElectronico, Integer celular, LocalDate fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
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


    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public Integer getCelular() {
        return celular;
    }


    public void setCelular(Integer celular) {
        this.celular = celular;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }
    
}


