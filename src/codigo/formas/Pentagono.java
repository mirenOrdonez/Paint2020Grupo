

package codigo.formas;

import java.awt.Color;

/**
 *
 * @author mohel
 */

//El pentagono hereda todo lo que tiene la forma mas lo que quiero añadir
public class Pentagono extends Forma {
    
    public Pentagono(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY,5, _color, _relleno);
    }
    
    
    
}
