/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import Modelo.Libro;

/**
 *
 * @author usuario
 */
public class RegistroLibro {
    
    private ArrayList<Libro> listalibros;

   
    
    
    
    public RegistroLibro() {
        
        listalibros=new ArrayList<Libro>();
        
    }
    
    
    public String addBook(Libro libro)
    {
        if(libro!=null)
        {
       if(Verificacion(libro.getId()))
       {
       listalibros.add(libro);
       return "El libro se guardo correctamente";
       }else{
           return "El libro ya se encuentra registrado";
       }
        
        }
        else
        {
        
        return "El libro no se ha encontrado";
        }
      
        
        
    
    
    }
    
    
    public boolean Verificacion(String id){
   
        if(id.equalsIgnoreCase(""))
      {    if(listalibros.size()!=0)
        {
             for(int i=0;i<listalibros.size();i++)
             {if(listalibros.get(i).getId().equalsIgnoreCase(id))
                 
                 return false;
             }
        }
      }
     return true;
    }
    
    public void ver(){
    
        for(Libro listaE:listalibros)
        {
        if(listaE.getId().equalsIgnoreCase(""))
        {
        
        }//fin del if
        }//fin for 
    }// fin del metodo void ver
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
