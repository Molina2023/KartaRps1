/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

/**
 *
 * @author nisit
 */
public class InterfazMenú extends javax.swing.JFrame {
    static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    
    public InterfazMenú() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFlechita = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblOpElemento = new javax.swing.JLabel();
        lblOpGrupo = new javax.swing.JLabel();
        lblOpNumMasa = new javax.swing.JLabel();
        lblOpPeriodo = new javax.swing.JLabel();
        lblOpSimbolo = new javax.swing.JLabel();
        lblOpClasificacion = new javax.swing.JLabel();
        lblOpNumA = new javax.swing.JLabel();
        lblPropiedad = new javax.swing.JLabel();
        lblOp10Preguntas = new javax.swing.JLabel();
        lblOp15Preguntas = new javax.swing.JLabel();
        lblOp25Preguntas = new javax.swing.JLabel();
        lblRondas = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(144, 215, 155));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(144, 215, 155));
        jPanel1.setForeground(new java.awt.Color(144, 215, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(825, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFlechita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecharegresar.png"))); // NOI18N
        lblFlechita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlechita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechitaMouseClicked(evt);
            }
        });
        jPanel1.add(lblFlechita, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 33, -1, -1));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulomenu.png"))); // NOI18N
        jPanel1.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 40, -1, -1));

        lblOpElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Elemento.png"))); // NOI18N
        jPanel1.add(lblOpElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 154, -1, -1));

        lblOpGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Grupo.png"))); // NOI18N
        jPanel1.add(lblOpGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 223, -1, -1));

        lblOpNumMasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Num. masa.png"))); // NOI18N
        jPanel1.add(lblOpNumMasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 171, -1, -1));

        lblOpPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Periodo.png"))); // NOI18N
        jPanel1.add(lblOpPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 239, -1, -1));

        lblOpSimbolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simbolo.png"))); // NOI18N
        lblOpSimbolo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblOpSimbolo.setFocusCycleRoot(true);
        lblOpSimbolo.setFocusable(false);
        lblOpSimbolo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lblOpSimboloComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                lblOpSimboloComponentRemoved(evt);
            }
        });
        lblOpSimbolo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblOpSimboloFocusGained(evt);
            }
        });
        jPanel1.add(lblOpSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 207, -1, -1));

        lblOpClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clasificacion.png"))); // NOI18N
        jPanel1.add(lblOpClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 258, -1, -1));

        lblOpNumA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Num. A.png"))); // NOI18N
        jPanel1.add(lblOpNumA, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 189, -1, -1));

        lblPropiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contenedorpropiedades.png"))); // NOI18N
        jPanel1.add(lblPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 102, -1, -1));

        lblOp10Preguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10 preguntas.png"))); // NOI18N
        jPanel1.add(lblOp10Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 166, -1, -1));

        lblOp15Preguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/15 preguntas.png"))); // NOI18N
        jPanel1.add(lblOp15Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 193, -1, -1));

        lblOp25Preguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/25 preguntas.png"))); // NOI18N
        jPanel1.add(lblOp25Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 223, -1, -1));

        lblRondas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contenerdorrondas.png"))); // NOI18N
        jPanel1.add(lblRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 102, -1, -1));

        lblTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tiempo.png"))); // NOI18N
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 102, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblOpSimboloComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lblOpSimboloComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblOpSimboloComponentAdded

    private void lblOpSimboloComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lblOpSimboloComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOpSimboloComponentRemoved

    private void lblOpSimboloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblOpSimboloFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOpSimboloFocusGained

    private void lblFlechitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechitaMouseClicked
        InterfazIniciar obj = new InterfazIniciar();
        obj.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFlechitaMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenú().setVisible(true);
            }
        });
        //final JFrame InterfazMenú = new JFrame ("Display Mode");
        //device.setFullScreenWindow(InterfazMenú);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFlechita;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOp10Preguntas;
    private javax.swing.JLabel lblOp15Preguntas;
    private javax.swing.JLabel lblOp25Preguntas;
    private javax.swing.JLabel lblOpClasificacion;
    private javax.swing.JLabel lblOpElemento;
    private javax.swing.JLabel lblOpGrupo;
    private javax.swing.JLabel lblOpNumA;
    private javax.swing.JLabel lblOpNumMasa;
    private javax.swing.JLabel lblOpPeriodo;
    private javax.swing.JLabel lblOpSimbolo;
    private javax.swing.JLabel lblPropiedad;
    private javax.swing.JLabel lblRondas;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}
