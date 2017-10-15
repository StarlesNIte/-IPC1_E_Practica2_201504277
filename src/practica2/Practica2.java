/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisMiguel
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    int tamano;

    public Practica2() {

        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número mayor a 3 para el tablero"));
        } catch (Exception e) {
    
        }
        Tablero tablero = new Tablero(tamano);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Practica2();
    }

}
