/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LuisMiguel
 */
public class Celula extends javax.swing.JButton implements ActionListener {

    private Boolean estado; //false esta muerta y true viva

    public Celula() {

        estado = false;
        addActionListener(this);
        color(estado);

    }

    public void color(Boolean estado) {
        if (estado) {
            this.setBackground(Color.white);
        } else {
            this.setBackground(Color.black);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (getEstado()) {
            setEstado(false);           
        } else {
            setEstado(true);
        }
    }

    /**
     * @return the estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
        color(estado);
        this.updateUI();
    }
}
