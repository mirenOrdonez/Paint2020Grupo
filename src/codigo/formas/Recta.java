/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mohel
 */

public class Recta extends JPanel{
    private int sign (int x) {
    return (x > 0) ? 1 : (x < 0) ? -1 : 0;  
    
}



public void drawBresenhamLine (int xstart, int ystart, int xend, int yend, Graphics g){
    int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

    dx = xend - xstart;
    dy = yend - ystart;

    incx = sign(dx);

    incy = sign(dy);


    if (dx < 0) dx = -dx;
    if (dy < 0) dy = -dy;

    if (dx > dy){
        pdx = incx; pdy = 0;
        es = dy;    el = dx;
    } else {
        pdx = 0;    pdy = incy;
        es = dx;    el = dy;
    }

    x = xstart;
    y = ystart;
    err = el/2;
    g.drawLine (x, y, x, y);

    for (int t = 0; t < el; t++)//if I multiply el a line will be longer
    {
        err -= es;
        if (err < 0) {
            err += el;
            x += incx;
            y += incy;
        } else {
            x += pdx;
            y += pdy;
        }

        g.drawLine (x, y, x, y);
    }
}
}

