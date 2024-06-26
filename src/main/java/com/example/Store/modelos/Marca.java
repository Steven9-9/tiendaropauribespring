package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombreMarca",nullable = false,length = 20)
    private String nombreMarca; // obligatorio y maximo 50 caracteres
    @Column(name="nit",nullable = false,length = 20)
    private String nit; //obligatorio solo numeros y maximo 10 digitos
    @Column(name="anoCreacion",nullable = false)
    private LocalDate anoCreacion; //obligatorio
    @Column(name="sedePrincipal",nullable = false,length = 15)
    private String sedePrincipal; // no se valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
