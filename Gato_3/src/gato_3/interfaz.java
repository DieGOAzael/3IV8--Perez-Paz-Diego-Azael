package gato_3;
import javax.swing.JOptionPane;
import ove.*;

public class interfaz extends javax.swing.JFrame {
    String[] botones = {"Sí, deseo salir.", "No, mi existencia es fútil."};
    ia meia = new ia();
    Ove meove = new Ove();
    
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        select = new javax.swing.JLabel();
        consola = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setBackground(new java.awt.Color(255, 204, 204));
        select.setFont(new java.awt.Font("Microsoft Uighur", 0, 100)); // NOI18N
        select.setForeground(new java.awt.Color(255, 51, 51));
        select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select.setText("GATO");
        select.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        select.setOpaque(true);
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 220, 80));

        consola.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        consola.setText("CONSOLA");
        consola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolaActionPerformed(evt);
            }
        });
        getContentPane().add(consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 190, -1));

        jugar.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 140, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_3/images/equis.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 60, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato_3/images/Gato2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void consolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consolaActionPerformed
        meove.main();
        
    }//GEN-LAST:event_consolaActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        meia.walden();
        this.setVisible(false);
    }//GEN-LAST:event_jugarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int mariell = JOptionPane.showOptionDialog(this, "¿Has encontrado el propósito de tu existencia?\nLos progresos no guardados se perderán."
                , "Dilema existencial", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        if(mariell == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
        }
    }//GEN-LAST:event_salirActionPerformed

    public static void todo(){
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consola;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jugar;
    private javax.swing.JButton salir;
    private javax.swing.JLabel select;
    // End of variables declaration//GEN-END:variables
}
