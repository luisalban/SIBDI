/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Libro;

/**
 *
 * @author usuario
 */
public class Principal {
    
    
    public static void main(String[] args) {
        Libro libro;
        libro = new Libro("El quijote de la mancha","miguel de cervantes","PJ13", "Primera", "La maria","Matanzas" );
        System.out.println("El libro encontrado:\n"+libro);
    }
    
}
