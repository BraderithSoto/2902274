package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


import com.citas.java.entidades.medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.entidades.CitaEnfermero;
import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Enfermero;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        //crear un medico
        //crear un objeto medico
        //crear una INSTANCIA de medico
        medico m = new medico(4, "Cristian", "Buitrago", TipoDocumento.CC, 1023456787L, 345261787L, Especialidad.CARDIOLOGIA);
        m.setNombre("Cristian");
        System.out.println("nombre:" + m.getNombre());

        medico me = new medico(4, "Cristofer", "Daza", TipoDocumento.CC, 10239988767L, 345261986L, Especialidad.OBSTETRICIA);
        me.setNombre("Cristofer");
        System.out.println("nombre:" + me.getNombre());
        


        Paciente p = new Paciente(11, "Jhon", "Soto", TipoDocumento.CC, 1234567890L, "jbsoto@gmail.com",
         123455432, LocalDate.of(2017, Month.APRIL, 20) ,1.60, 67.0, TipoSangre.O, '+');
         p.setNombre("Jhon");
        System.out.println("nombre:" + p.getNombre());

        Paciente pa = new Paciente(12, " Juliana", " Arevalo", TipoDocumento.CC, 1234478903L, " jullsz23@gmail.com",
         325667490, LocalDate.of(2003, Month.JANUARY, 20),1.60, 67.0, TipoSangre.A, '+');
         pa.setNombre(" Juliana");
        System.out.println("nombre:" + pa.getNombre());

        Paciente pb = new Paciente(13, "Andrea", "Torres", TipoDocumento.TI, 1087567890L, "andre@gmail.com",
        123554322, LocalDate.of(2006, Month.AUGUST, 1),1.90, 77.0, TipoSangre.O, '-');
        pb.setNombre("Andrea");
       System.out.println("nombre:" + pb.getNombre());

       Paciente pc = new Paciente(14, "Juan", "Sanchez", TipoDocumento.CC, 99436288364L, "san003@gmail.com",
       453677290, LocalDate.of(2005, Month.JULY, 9),1.40, 67.0, TipoSangre.O, '+');
       pc.setNombre("Juan");
      System.out.println("nombre:" + pc.getNombre());

      Paciente pd = new Paciente(15, "Julio", "Suta", TipoDocumento.CC, 123450678906L, "suta@gmail.com",
      1234999322, LocalDate.of(2002, Month.JANUARY, 8),1.80, 87.0, TipoSangre.O, '-');
      pd.setNombre("Julio");
     System.out.println("nombre:" + pd.getNombre());


     Enfermero e = new Enfermero(12, "Sergio", "Arias", TipoDocumento.CC, 11415737L, 1254364L);
    e.setNombre("Sergio");
    System.out.println("nombre" + e.getNombre());
    
    Enfermero ea = new Enfermero(12, "Karen", "Perez", TipoDocumento.CC, 11415737L, 1254364L);
    ea.setNombre("Karen");
    System.out.println("nombre" + ea.getNombre());
    
    Enfermero eb = new Enfermero(14, "Andres", "Ramirez", TipoDocumento.CC, 11415737L, 1254364L);
    eb.setNombre("Andres");
    System.out.println("nombre" + eb.getNombre());
    

    CitaMedico cml = new CitaMedico(pa, LocalDateTime.of(2006, Month.APRIL, 06, 12, 23), "Gripa", me, null);

    System.out.println("Estado de la cita " + cml.getEstadoCita());

    

    
    CitaMedico cm2= new CitaMedico(pa, LocalDateTime.of( 2003, Month.NOVEMBER,  26, 23, 50), "Gripa", me, null);

    System.out.println("Estado de la cital al inicio " + cml.getEstadoCita());
    System.out.println(cml);
    cml.cancelarCita();
    System.out.println("Estado de la cita despues de cancelar: " + cml.getEstadoCita());

    CitaEnfermero ce1 = new CitaEnfermero(pc, LocalDateTime.of(2009, 4, 20, 1, 29, 0),
     ProcedimientosEnfermeria.VACUNACION, ea);
     ce1.cancelarCita();

    }
    
}