/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.PanelBotones;
import Vista.PanelDataLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ControlLibro implements ActionListener{
    
    private PanelBotones panelBotones;
    private PanelDataLibro panelDataLibro;

    
    public ControlLibro(PanelBotones panelBotones, PanelDataLibro panelDataLibro){
        this.panelBotones = panelBotones;
        this.panelDataLibro = panelDataLibro;
    
    }

   
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource().equals(panelBotones.getBtnAgregar())){
            JOptionPane.showMessageDialog(null,"   AGREGAR  ");
        }
        if(evento.getSource().equals(panelBotones.getBtnConsultar())){
            JOptionPane.showMessageDialog(null,"   CONSULTAR  ");
        }
        if(evento.getSource().equals(panelBotones.getBtnEliminar())){
            JOptionPane.showMessageDialog(null,"   ELIMINAR  ");
        }
        if(evento.getSource().equals(panelBotones.getBtnModificar())){
            JOptionPane.showMessageDialog(null,"   MODIFICAR  ");
        }
        if(evento.getSource().equals(panelBotones.getBtnSalir())){
            JOptionPane.showMessageDialog(null,"   SALIR  ");
        }
        
        
    }
    
    
    
    
}
