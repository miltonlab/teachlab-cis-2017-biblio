/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbiblioteca.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import jbiblioteca.modelo.*;

/**
 *
 * @author miltonlab
 */
@Entity
@Table(name = "LIBROS")
public class Libro implements Serializable{
    
    @Id
    @Column(length = 17)
    private String isbn;
    
    @Column
    private String titulo;
    
    @ManyToMany
    @JoinTable(name = "LIBRO_AUTOR", 
            joinColumns = {@JoinColumn(name="libro_id", referencedColumnName = "isbn")},
            inverseJoinColumns = {@JoinColumn(name="autor_id", referencedColumnName = "id")})
    private List<Autor> autores = null;

    @Column
    private double precio;

    @Column
    private int año;

    private String categoria;
    
    @ManyToOne
    @JoinColumn(name="editorial_id")
    private Editorial editorial;


    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }


    public Libro(String isbn, String titulo, double precio, String area) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
        this.categoria = area;
    }

    public Libro() {
    }

    
    
    /**
     * Get the value of categoria
     *
     * @return the value of categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Set the value of categoria
     *
     * @param categoria new value of categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Get the value of autores
     *
     * @return the value of autores
     */
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * Set the value of autores
     *
     * @param autores new value of autores
     */
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    /**
     * Get the value of isbn
     *
     * @return the value of isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Set the value of isbn
     *
     * @param isbn new value of isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", codigo=" + isbn + ", precio=" + precio + ", categoria=" + categoria + ", año=" + año + '}';
    }

}
