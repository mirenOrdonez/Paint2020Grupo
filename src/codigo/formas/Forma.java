/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author mirenordonezdearce
 */
public class Forma extends Polygon {
    public Color color = null;
    public boolean relleno = false;
    
    //coordenadas del centro de la forma
    public int x = 0;
    public int y = 0;
    
    //para el constructor
    public Forma (int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(new int[_lados], new int [_lados], _lados); //el 1º va a ser para las posiciones de x de todos los lados
        // el 2º para las posiciones de y de todos los lados y el 3º para el número de lados. 
        x = _posX;
        y = _posY;
        color = _color;
        relleno = _relleno;
        
    }
    
    public void dibujate(Graphics2D g2, int _posX, int _posY) { 
       calculaVertices (y - _posY, x - _posX);
       g2.setColor(color);
       if (relleno) {
           g2.fill(this);
       }
       else {
           g2.draw(this);
       }
    }
    
    //Este método recalcula la posición de los vértices en un polígono regular. 
    public void calculaVertices (int _radio, double _giro) {
        for (int i=0; i < npoints; i++) { //npoints es el número de lados, se corresponde con _lados. 
            xpoints [i] = (int) (x + _radio*Math.cos((2*Math.PI*i + _giro/40) / npoints));
            ypoints [i] = (int) (y + _radio*Math.sin((2*Math.PI*i + _giro/40) / npoints));
        }
    }
}
