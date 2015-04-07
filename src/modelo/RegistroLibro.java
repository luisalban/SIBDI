/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibro {

    private ArrayList<Libro> listaLibros;

    public RegistroLibro() {
        listaLibros = new ArrayList<Libro>();
    }

    public String addBook(Libro libro) {
        if (libro != null) {
            
        } else {
            return "El objeto es null";
        }
        return null;
    

 
    }
    
    public boolean verificarID(String id) {

        if (!id.equalsIgnoreCase("")) {
            if (listaLibros.size() != 0) {
                for (int index = 0; index <listaLibros.size(); index++){
                    if (listaLibros.get(index).getId().equalsIgnoreCase(id)){
                        return false;
                    }  
                }
            }
        }
         return true;
    }
    
    public void ver(){
        for(Libro libroE : listaLibros){
            if(libroE.getId().equalsIgnoreCase("")){
        
            }
        }
    }
    
    public String eliminarLibro(String id){
        
        String salida = "";
        Libro libroEli = null;
        
        for(int i=0; i< listaLibros.size(); i++){
            if(listaLibros.get(i)!= null){
                if(listaLibros.get(i).getId().equals(id)){
                    libroEli = listaLibros.get(i);
                    listaLibros.remove(libroEli);
                    salida = "El libro se elimino";
                }
            }
            else{
                salida = "El ID no se encontro.";
            }
        }
        
        return salida;  
    }




}
