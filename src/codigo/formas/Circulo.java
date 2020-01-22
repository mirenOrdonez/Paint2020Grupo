/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 *
 * @author mohel
 */

//El circulo es una extension de una elepise.
public class Circulo extends Ellipse2D.Double{
    //creo una varible para el color del circulo y otra variable para que no
    //no tenga relleno
    public Color color = Color.BLACK;
    public boolean relleno = false;
    //Extiendo elipse 2D para ponerle la siguiente propiedades y obtener lo que
    //nosotros queremos hacer.
    public Circulo(int _posX, int _posY, int _diametro, Color _color, boolean _relleno){
     //invoco al contructor de la clase superior Ellipse2D.Double.
      super();
      x = _posX; //asigno la posX que me pasa al constrcutor el objeto a la propedad
                 //x de los ellips2D.double
      y = _posY;
      width = _diametro;
      height = _diametro;
      color = _color;
      relleno = _relleno;
        
    }
    //Le paso solo el diametro ya que con eso es sufucuente para dibujar el circulo
    public void dibujate(Graphics2D g2, int _posX){
            int diametro = Math.abs((int)x - _posX);
            width = diametro;
            height = diametro;
            g2.setColor(color);
            if (relleno){
                g2.fill(this);
            }
            else{
                g2.draw(this);
            }
            
            
        
    }
    
    
}
