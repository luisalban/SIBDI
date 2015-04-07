/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private String edicion;
    private String editorial;
    private String categoria;

    public Libro(String titulo, String autor, String id, String edicion, String editorial, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.edicion = edicion;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public Libro() {
        
        this.titulo ="";
        this.autor = "";
        this.id = "";
        this.edicion = "";
        this.editorial = "";
        this.categoria = "";
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", id=" + id + ", edicion=" + edicion + ", editorial=" + editorial + ", categoria=" + categoria + '}';
    }
    
     
    
}
