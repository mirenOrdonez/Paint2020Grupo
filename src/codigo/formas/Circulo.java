/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;



/**
 *
 * @author mirenordonezdearce
 */


public class Circulo extends Ellipse2D.Double { //extiende a ellipse porque lo que pretendemos dibujar es un círculo.
    public Color color = Color.BLACK;
    public boolean relleno = false; //para la posibilidad de rellenar el círculo
    
    //necesitamos un constructor porque necesitamos que se vea el objeto que dibujemos.
    public Circulo(int _posX, int _posY, int _diametro, Color _color, boolean _relleno) {
        super(); //invocamos al constructor de la clase superior, que aquí es Ellipse2D.Double. 
        x = _posX; //asigno la _posX que me pasan al construir el objeto a la propiedad x de los Ellipse2D.Double
        y = _posY;
        width = _diametro;
        height = _diametro;
        color = _color;
        relleno = _relleno;
    }
    
    //solo necesitamos pasar la posX porque a medida que se va 
    //alejando el evento de MousePressed, conseguimos la nueva posX y con eso hallamos width y height, 
    //es decir, el diámetro. 
    public void dibujate(Graphics2D g2, int _posX) { 
       int diametro = Math.abs( (int)x - _posX); //diametro es un valor nuevo, por eso va sin guión bajo. 
       width = diametro;
       height = diametro;
       g2.setColor(color);
       if (relleno) {
           g2.fill(this);
       }
       else {
           g2.draw(this);
       }
    }
}
