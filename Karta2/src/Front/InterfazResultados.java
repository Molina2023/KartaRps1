package Front;

import Front.*;

public class InterfazResultados extends javax.swing.JFrame {

    int xMouse, yMouse;
    public InterfazResultados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBtnExit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        lblBtnFlecha = new javax.swing.JLabel();
        lblMedalla = new javax.swing.JLabel();
        lblNombreLogro = new javax.swing.JLabel();
        lblRecLogro = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblPreguntas = new javax.swing.JLabel();
        lblImgTiempo = new javax.swing.JLabel();
        lblImgPreguntas = new javax.swing.JLabel();
        lblAciertos = new javax.swing.JLabel();
        lblImgAciertos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(144, 215, 155));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBtnExit.setBackground(new java.awt.Color(144, 215, 155));
        pnlBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBtnExitMouseExited(evt);
            }
        });
        pnlBtnExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlBtnExit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, -1, -1));

        getContentPane().add(pnlBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlBarra.setBackground(new java.awt.Color(144, 215, 155));
        pnlBarra.setOpaque(false);
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });
        getContentPane().add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 25));

        pnlPrincipal.setBackground(new java.awt.Color(144, 215, 155));
        pnlPrincipal.setForeground(new java.awt.Color(144, 215, 155));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(825, 480));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgFlechaAtras.png"))); // NOI18N
        lblBtnFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnFlechaMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblBtnFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 36, -1, -1));

        lblMedalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgMedallaOro.png"))); // NOI18N
        pnlPrincipal.add(lblMedalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 92, -1, -1));

        lblNombreLogro.setFont(new java.awt.Font("Segoe UI Black", 2, 13)); // NOI18N
        lblNombreLogro.setForeground(new java.awt.Color(191, 177, 52));
        lblNombreLogro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreLogro.setText("Logro");
        pnlPrincipal.add(lblNombreLogro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 31, 142, 21));

        lblRecLogro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgRecLogro.png"))); // NOI18N
        pnlPrincipal.add(lblRecLogro, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 27, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(172, 110, 9));
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("jLabel6");
        pnlPrincipal.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 138, 161, 53));

        lblPreguntas.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        lblPreguntas.setForeground(new java.awt.Color(172, 110, 9));
        lblPreguntas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreguntas.setText("15");
        pnlPrincipal.add(lblPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 232, 65, 52));

        lblImgTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgTiempo.png"))); // NOI18N
        pnlPrincipal.add(lblImgTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 95, -1, -1));

        lblImgPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgPreguntas.png"))); // NOI18N
        pnlPrincipal.add(lblImgPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 195, -1, -1));

        lblAciertos.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        lblAciertos.setForeground(new java.awt.Color(172, 110, 9));
        lblAciertos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAciertos.setText("15");
        pnlPrincipal.add(lblAciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 316, 48, 53));

        lblImgAciertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgAciertos.png"))); // NOI18N
        pnlPrincipal.add(lblImgAciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 273, -1, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBarraMouseDragged

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnExitMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBtnExitMouseClicked

    private void pnlBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnExitMouseEntered
        pnlBtnExit.setBackground(new java.awt.Color(215,144,144));
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBtnExitMouseEntered

    private void pnlBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnExitMouseExited
        pnlBtnExit.setBackground(new java.awt.Color(144,215,155));
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBtnExitMouseExited

    private void lblBtnFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnFlechaMouseClicked
        InterfazIniciar obj = new InterfazIniciar();
        obj.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnFlechaMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAciertos;
    private javax.swing.JLabel lblBtnFlecha;
    private javax.swing.JLabel lblImgAciertos;
    private javax.swing.JLabel lblImgPreguntas;
    private javax.swing.JLabel lblImgTiempo;
    private javax.swing.JLabel lblMedalla;
    private javax.swing.JLabel lblNombreLogro;
    private javax.swing.JLabel lblPreguntas;
    private javax.swing.JLabel lblRecLogro;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlBtnExit;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
