/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbiblioteca.modelo;

/**
 *
 * @author miltonlab
 */
public class Libro {
    
    private String titulo;

    private String codigo;

    private String autores;

    private double precio;

    private String area;

    public Libro(String titulo, String codigo, String autores, double precio, String area) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        this.precio = precio;
        this.area = area;
    }

    public Libro() {
    }

    
    
    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public String getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    public void setArea(String area) {
        this.area = area;
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
    public String getAutores() {
        return autores;
    }

    /**
     * Set the value of autores
     *
     * @param autores new value of autores
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

}
