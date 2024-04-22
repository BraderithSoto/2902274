package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public abstract class Persona {

        private Integer id;
        private String nombres;
        private String apellido;
        private TipoDocumento tipoDocumento;
        private long numeroDocumento;

        public Persona(Integer id, String nombres, String apellido, TipoDocumento tipoDocumento, long numeroDocumento) {
            this.id = id;
            this.nombres = nombres;
            this.apellido = apellido;
            this.tipoDocumento = tipoDocumento;
            this.numeroDocumento = numeroDocumento;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
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

        public long getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(long numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        
}
