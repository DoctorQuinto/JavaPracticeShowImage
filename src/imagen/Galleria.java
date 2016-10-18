/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *   Ejemplo Modelos & Galeria
 * @author Desarrollo
 */
public class Galleria extends javax.swing.JFrame {

    /**
    */
    
    ImageIcon Imagen[]=new ImageIcon[12];
    int contador = 1;
    
    
    public Galleria() {
        
        initComponents();
        this.setTitle("Practicas con @nd&nE");
        for(int i = 1 ; i< Imagen.length ; i++)
        {
            Imagen[i]=new ImageIcon(getClass().getResource("/Img/fot"+i+".jpg"));
        }
        lbl_Imagen_Show.setIcon(Imagen[contador]);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Izquierda = new javax.swing.JButton();
        btn_Derecha = new javax.swing.JButton();
        lbl_Imagen_Show = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Izquierda.setForeground(new java.awt.Color(0, 204, 0));
        btn_Izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rdn_Izq 30 x 30.fw.png"))); // NOI18N
        btn_Izquierda.setBorder(null);
        btn_Izquierda.setBorderPainted(false);
        btn_Izquierda.setContentAreaFilled(false);
        btn_Izquierda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Izquierda.setIconTextGap(0);
        btn_Izquierda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btn_Derecha.setForeground(new java.awt.Color(0, 204, 0));
        btn_Derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rdn_Der 30x30.fw.png"))); // NOI18N
        btn_Derecha.setBorder(null);
        btn_Derecha.setContentAreaFilled(false);
        btn_Derecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Derecha.setIconTextGap(0);
        btn_Derecha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DerechaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        lbl_Imagen_Show.setForeground(new java.awt.Color(0, 204, 0));
        lbl_Imagen_Show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Imagen_Show.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SHOW IMAGES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Audiowide", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lbl_Imagen_Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 500, 370));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/este.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DerechaActionPerformed
        if(contador == 10)
            contador = 0;
        contador ++ ;
        lbl_Imagen_Show.setIcon(Imagen[contador]);
    }//GEN-LAST:event_btn_DerechaActionPerformed

    private void btn_IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IzquierdaActionPerformed
        if(contador == 1)
            contador = 11;
        contador -- ;
        lbl_Imagen_Show.setIcon(Imagen[contador]);
    }//GEN-LAST:event_btn_IzquierdaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Derecha;
    private javax.swing.JButton btn_Izquierda;
    private javax.swing.JLabel lbl_Imagen_Show;
    private javax.swing.JLabel lbl_fondo;
    // End of variables declaration//GEN-END:variables
}