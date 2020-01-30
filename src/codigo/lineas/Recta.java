/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.lineas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;


/**
 *
 * @author mirenordonezdearce
 */
public class Recta extends javax.swing.JPanel {
    public Color color = null;
    
    public int x1 = MouseEvent.MOUSE_PRESSED;
    public int y1 = MouseEvent.MOUSE_PRESSED;
    public int x2 = MouseEvent.MOUSE_RELEASED;
    public int y2 = MouseEvent.MOUSE_RELEASED;
    
  
   
    
    public void dibujaRecta (Graphics2D g, int x, int y, int x0, int y0) {
        x = x1;
        y = y1;
        x0 = x2;
        y0 = y2;
        
        g.drawLine(x1, y1, x2, y2);
    }
        
    
    
    
}
