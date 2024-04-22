package com.citas.java.entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {

    //definiciones de metodos
    //solo se ponen las firmas de metodos
    //por que la implementacion(instrucciones)
    //corren por cuenta de las clases
    public void agendarCita(LocalDateTime fechaCita);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fechaCita);


}
