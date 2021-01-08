package gato_3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ove.ingresar;
import ove.procesos;

public class puntos extends javax.swing.JFrame {
    String[] botones = {"Sí, deseo salir.", "No, mi existencia es fútil."};
    interfaz meinterfaz = new interfaz();

    public puntos(int puntox, int puntoo) {
        initComponents();
        puntos1.setText(puntoo + "");
        puntos2.setText(puntox + "");
        this.setLocationRelativeTo(null);
        
        procesos puntos = new procesos();
        List<ingresar> puntoss = new ArrayList<ingresar>();
        puntoss = puntos.getListalibros();
        
        int i = 0;
        for (ingresar puntos3 : puntoss) {
            
            
            if(i == 0 ){
                nombre1.setText(puntos3.getNombre());
                edad1.setText(puntos3.getEdad() + "");    
                i++;
            }else{
                nombre2.setText(puntos3.getNombre());
                edad2.setText(puntos3.getEdad() + "");
            
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nie = new javax.swing.JLabel();
        idziesz_do_domu = new javax.swing.JLabel();
        puntos2 = new javax.swing.JLabel();
        edad2 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        puntos1 = new javax.swing.JLabel();
        edad1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        espalda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_3/images/equis.png"))); // NOI18N
        nie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nieMousePressed(evt);
            }
        });
        getContentPane().add(nie, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        idziesz_do_domu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_3/images/casa.png"))); // NOI18N
        idziesz_do_domu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idziesz_do_domuMousePressed(evt);
            }
        });
        getContentPane().add(idziesz_do_domu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 50, 50));

        puntos2.setBackground(new java.awt.Color(255, 255, 255));
        puntos2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        puntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos2.setText("PUNTOS2");
        puntos2.setOpaque(true);
        getContentPane().add(puntos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 100, 60));

        edad2.setBackground(new java.awt.Color(255, 255, 255));
        edad2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        edad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edad2.setText("EDAD2");
        edad2.setOpaque(true);
        getContentPane().add(edad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, 50));

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre2.setText("NOMBRE2");
        nombre2.setOpaque(true);
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 100, 60));

        puntos1.setBackground(new java.awt.Color(255, 255, 255));
        puntos1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        puntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos1.setText("PUNTOS1");
        puntos1.setOpaque(true);
        getContentPane().add(puntos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 100, 60));

        edad1.setBackground(new java.awt.Color(255, 255, 255));
        edad1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        edad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edad1.setText("EDAD1");
        edad1.setOpaque(true);
        getContentPane().add(edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, 50));

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        nombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre1.setText("NOMBRE1");
        nombre1.setOpaque(true);
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, 60));

        nombre.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 0, 102));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, -1));

        edad.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        edad.setForeground(new java.awt.Color(204, 0, 102));
        edad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edad.setText("EDAD");
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, -1));

        puntos.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        puntos.setForeground(new java.awt.Color(204, 0, 102));
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos.setText("PUNTOS");
        getContentPane().add(puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, -1));

        espalda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_3/images/Gato2.jpg"))); // NOI18N
        getContentPane().add(espalda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nieMousePressed
        int mariell = JOptionPane.showOptionDialog(this, "¿Has encontrado el propósito de tu existencia?\nLos progresos no guardados se perderán."
                , "Dilema existencial", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        if(mariell == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
        }
    }//GEN-LAST:event_nieMousePressed

    private void idziesz_do_domuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idziesz_do_domuMousePressed
        meinterfaz.todo();
        this.setVisible(false);
    }//GEN-LAST:event_idziesz_do_domuMousePressed

    public static void puntaje(int puntox, int puntoo){
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
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puntos(puntox, puntoo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edad;
    private javax.swing.JLabel edad1;
    private javax.swing.JLabel edad2;
    private javax.swing.JLabel espalda;
    private javax.swing.JLabel idziesz_do_domu;
    private javax.swing.JLabel nie;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel puntos1;
    private javax.swing.JLabel puntos2;
    // End of variables declaration//GEN-END:variables
}