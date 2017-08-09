/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbiblioteca.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author miltonlab
 */
public class Prestamo {
    
    private double id;

    private LocalDate fecha;

    private LocalTime hora;

    private ArrayList<Libro> libros = new ArrayList<Libro>();

    /**
     * Get the value of libros
     *
     * @return the value of libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Set the value of libros
     *
     * @param libros new value of libros
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Get the value of hora
     *
     * @return the value of hora
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Set the value of hora
     *
     * @param hora new value of hora
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Set the value of fecha
     *
     * @param fecha new value of fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public double getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(double id) {
        this.id = id;
    }

}
