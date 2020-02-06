
package codigo;

import codigo.formas.Circulo;
import codigo.formas.Cuadrado;
import codigo.formas.Decagono;
import codigo.formas.Eneagono;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import codigo.formas.Heptagono;
import codigo.formas.Hexagono;
import codigo.formas.Octogono;
import codigo.formas.Pentagono;
import codigo.formas.TrianguloEquilatero;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @authors @writters @directors
 * Mohamed El Boudakhani Ikatouaran
 * Miren Ordóñez de Arce
 */
public class VentanaPrincipalGrupal extends javax.swing.JFrame {

    //Vamos a tener un segundo buffer que nos ayudará a la hora de pintar la forma final. 
    BufferedImage buffer, buffer2 = null;
    //Graphics2D es una librería de java que nos va a permitir hacer los triángulos, cuadrados y demás. 
    //Vamos a declarar una para el buffer y otra para el jpanel.
    Graphics2D bufferGraphics, bufferGraphics2, jpanelGraphics = null;

    
    Circulo miCirculo = null;
    Forma miForma = new Forma (-1, -1, 1, Color.WHITE, false);
    
    Line2D.Double miRecta = null;
    //creamos 2 coordenada y las declaramos
    int x1,x2,y1,y2 = 0;
    
    BasicStroke s ;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipalGrupal() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640, 450); //Para el cuadro de colores que va a aparecer cuando se pulse el Panel de Colores
        miRecta = new Line2D.Double();
        
        //PARA LOS ICONOS. 
        //círculo
        herramientas1.jLabel1.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/circulo.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel1.getWidth(), herramientas1.jLabel1.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //lapiz
        herramientas1.jLabel5.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/lapiz.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel5.getWidth(), herramientas1.jLabel5.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //borrador
        herramientas1.jLabel15.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/borrador.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel15.getWidth(), herramientas1.jLabel15.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //cuadrado
        herramientas1.jLabel2.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/cuadrado.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel2.getWidth(), herramientas1.jLabel2.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //triangulo
        herramientas1.jLabel9.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/triangulo.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel9.getWidth(), herramientas1.jLabel9.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //estrella
        herramientas1.jLabel4.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/estrella.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel4.getWidth(), herramientas1.jLabel4.getHeight(), Image.SCALE_DEFAULT)
                
        ));
        //recta
        herramientas1.jLabel14.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/imagenes/recta.png")).getImage()
                    .getScaledInstance(herramientas1.jLabel14.getWidth(), herramientas1.jLabel14.getHeight(), Image.SCALE_DEFAULT)
                
        ));
    }

    private void inicializaBuffers() {
        //Voy a crear una imagen del mismo ancho y alto que el jPanel1.
        buffer = (BufferedImage)jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer2 = (BufferedImage)jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        
        
        //Creo una imagen modificable, que va a ser de tipo graphics2D. 
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        
      
        //Inicializo el buffer para que se pinte de blanco entero.
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        
        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        
        jpanelGraphics = (Graphics2D) jPanel1.getGraphics(); //Enlace el jPanel Graphics con el jPanel normal.
       
    }
    
    //Vamos a enlazar el panel con la zona de memoria en la que estás dibujando. 
    @Override 
    public void paint(Graphics g) {
      super.paint(g);  //llama a la clase que estoy extendiendo que es la de jFrame, que tiene un método paint.
      //Añadimos que en el jPanel se dibuje la imagen. Pinto el buffer sobre el jPanel.
      jpanelGraphics.drawImage(buffer, 0, 0, null); //le dice que sea una imagen, en la posición (0,0), y null porque sí.
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        panelColores1 = new codigo.PanelColores();
        herramientas1 = new codigo.Herramientas();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 240, 219));

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jButton1.setText("Panel de colores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 203, 159));

        jMenu1.setText("File");

        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("New");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Borrar todo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(herramientas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null); //esto va a coger la pantalla, la borra entera y deja el buffer2 con la forma final elegida. 
        switch(herramientas1.formaElegida) {
            case 1: miCirculo.dibujate(bufferGraphics, evt.getX());break; 
            
            case 2: bufferGraphics.setColor(panelColores1.colorSeleccionado);
                    miRecta.x2  = evt.getX();
                    miRecta.y2 = evt.getY();
                    bufferGraphics.draw(miRecta);
                    break;   
            
            case 3: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 4: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 5: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 6: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 7: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 8: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 9: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 10: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 11: // guardo el fin del trazo en el que estoy y lo pinta y inicializamos
                    //el siguiente trazo con el fin del anterior.
                    x2= evt.getX();
                    y2=evt.getY();
                    s =  new BasicStroke(herramientas1.grosor);
                    if (x1!=x2 || y1!=y2){
                        bufferGraphics2.setColor(panelColores1.colorSeleccionado);
                        bufferGraphics2.setStroke(s);
                        bufferGraphics2.drawLine(x1, y1, x2, y2);
                        x1=x2;
                        y1=y2;
                    }
                    break;
            
            case 256: miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            //Esto para la goma de borrar.
            case 1000: bufferGraphics2.setColor(Color.WHITE); 
                       bufferGraphics2.fillOval(evt.getX(), evt.getY(), herramientas1.grosor, herramientas1.grosor); break;
                
        }
        
        
        repaint(0,0,1,1); //primero se pinta en la memoria y el repaint sirve para que se muestre en el jPanel1.
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch(herramientas1.formaElegida) {
            //el caso 1 crea un círculo desde donde se haga click en la pantalla
            case 1: miCirculo = new Circulo(evt.getX(), evt.getY(), 1, panelColores1.colorSeleccionado, herramientas1.relleno); 
                    miCirculo.dibujate(bufferGraphics, evt.getX());break;
                   
            case 2: miRecta = new Line2D.Double();
                    miRecta.x1  = evt.getX();
                    miRecta.y1 = evt.getY();
                    break;    
             
            case 3: miForma = new TrianguloEquilatero(evt.getX(), evt.getY(), 3, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                    
            case 4: miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                    
            case 5: miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                  
            case 6: miForma = new Hexagono(evt.getX(), evt.getY(), 6, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                    
            case 7: miForma = new Heptagono(evt.getX(), evt.getY(), 7, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
            
            case 8: miForma = new Octogono(evt.getX(), evt.getY(), 8, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                   
            case 9: miForma = new Eneagono(evt.getX(), evt.getY(), 9, panelColores1.colorSeleccionado, herramientas1.relleno);
                    miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                    
            case 10: miForma = new Decagono(evt.getX(), evt.getY(), 10, panelColores1.colorSeleccionado, herramientas1.relleno);
                     miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                     
            //usa los eventos del raton y guarda los puntos del siguiente trazo.
            case 11: x1  = evt.getX();
                     y1 = evt.getY();
                     break;
            
            //Para la pipeta
            case 88: int color = buffer.getRGB(evt.getX(), evt.getY());
                     panelColores1.colorSeleccionado = new Color(color);
                     panelColores1.cambiarFondo(panelColores1.colorSeleccionado);
                
            case 256:  miForma = new Estrella(evt.getX(), evt.getY(), 256, panelColores1.colorSeleccionado, herramientas1.relleno);
                       miForma.dibujate(bufferGraphics, evt.getX(), evt.getY()); break;
                       
            case 1000: break; //Para la goma de borrar.
           
        }
        
        
        
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //Esto va a hacer que finalmente se guarde la forma elegida, SALVO EL CÍRCULO. (SOLUCIONADO CÍRCULO) 
        miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY()); 
         
        //Para el círculo, que se mantenga en la pantalla después de soltar el ratón. 
        if (herramientas1.formaElegida == 1) {
            miCirculo.dibujate(bufferGraphics2, evt.getX());
        }


    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.setVisible(true); //Va a abrir la ventana del panel de colores
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false); //Va a hacer que se cierre la ventana del panel de colores
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false); //Tb quiero que se cierre la ventana
        panelColores1.colorSeleccionado = jColorChooser1.getColor(); //y queremos que guarde el color que se ha seleccionado
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this); //para guardar la ventanaPrincipal, el Frame. 
        if (seleccion == JFileChooser.APPROVE_OPTION) { //esto sirve para cuando le da al botón guardar.
            //declaramos un objeto de tipo file
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName(); //para que se guarde con el nombre que hayas puesto. 
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length()); //para que obligue al usuario a poner la extensión
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer, "png", fichero);
                }
                catch (IOException e) {
                //Aquí se podría poner un mensaje de por qué no ha funcionado el guardar. 
                //Lo de try y catch es algo que tienes que ponerlo para los casos en que algo falle. 
                }
            }
            else {
                //mensaje de extensión no válida. 
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    buffer = ImageIO.read(fichero);
                    repaint(0,0,1,1);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGrupal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGrupal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGrupal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGrupal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalGrupal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private codigo.Herramientas herramientas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private codigo.PanelColores panelColores1;
    // End of variables declaration//GEN-END:variables
}
