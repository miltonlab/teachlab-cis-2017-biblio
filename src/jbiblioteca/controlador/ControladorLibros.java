/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbiblioteca.controlador;

import java.util.ArrayList;
import jbiblioteca.modelo.Libro;

/**
 *
 * @author miltonlab
 */
public class ControladorLibros {
 
        private ArrayList<Libro> listaLibros = new ArrayList<Libro>();

    public ControladorLibros() {
        listaLibros.add(new Libro("Lo que el viento se llevó", "L102", "Grabiel García", 30, "Literatura"));
        listaLibros.add(new Libro("Diseño Mecánico", "L103", "Jorge Maldonado", 23.5, "Electromecánica"));
        listaLibros.add(new Libro("Bases de Datos MySQL", "L104", "Oracle SA", 30, "Informática"));
    }

        
        
    /**
     * Get the value of listaLibros
     *
     * @return the value of listaLibros
     */
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * Set the value of listaLibros
     *
     * @param listaLibros new value of listaLibros
     */
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

}
