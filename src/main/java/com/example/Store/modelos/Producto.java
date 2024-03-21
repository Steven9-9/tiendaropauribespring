package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombreProducto",nullable = false,length = 20)
    private String nombreProducto; // no vacio solo letras y espacios longitud 60
    @Column(name="referencia",nullable = false,length = 15)
    private String referencia; // no vacio longitud 14
    @Column(name="talla",nullable = false,length = 6)
    private String talla; //maximo 3 caracteres
    @Column(name="cantidadBodega",nullable = false)
    private Integer cantidadBodega; // solo numeros positivos
    @Column(name="precioUnitario",nullable = false)
    private Integer precioUnitario; //solo numeros positivos
    @Column(name="descripcion",nullable = false,length = 30)
    private String descripcion; // maximo 100 caracteres
    @Column(name="fotografia",nullable = false,length = 250)
    private String fotografia; //no vacio y maximo 255 caracteres

    public Producto() {
    }


    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }
}
