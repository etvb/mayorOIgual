/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg21.pkg2.mayoroigual;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS212MayorOIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        
        if(num1 < num2){
            JOptionPane.showMessageDialog(null, num2 + " Es mayor que " + num1 );
        }else if(num1 > num2){
            JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
        }else{
            JOptionPane.showMessageDialog(null, "Son iguales");
        }
        
        
    }
    
}
