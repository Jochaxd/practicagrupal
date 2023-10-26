package com.practicagrupal.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable { //serializacion funciona para almacenar ciertos datos en el disco
    
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria del idArbol
    
    @Id //tabla arbol tiene una llave o identificador que va a ser el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que tipo de estrategia utilizan, identico = sea igual en la BD y en la clase
    @Column(name="id_arbol") //Decir cual es el nombre de la columna en la base de datos.
    private long idArbol;
    private String nombreComun;
    private String tipoFlor;
    private int durezaMadera;
    private String rutaImagen;

    public Arbol() {
    }

    public Arbol(String nombreComun, String tipoFlor, int durezaMadera) {
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.durezaMadera = durezaMadera;

    }
    
    
}
