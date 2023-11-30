/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import karta2.*;

public class InterfazPregunta extends javax.swing.JFrame {

    int xMouse, yMouse;
    ElementosObj obj = new ElementosObj();
    static ArrayList<Preguntas> item = new ArrayList<Preguntas>();
    public static boolean ResSi = false;
    public static String ResUsuario;
    public static Elemento elemento;
    public static karta2.Enum.Pregunta TipoPregunta;
    
    public InterfazPregunta() {
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

        pnlBtnExit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        miniMenuPnl1 = new Front.MiniMenuPnl();
        jPanel1 = new javax.swing.JPanel();
        lblResCheck = new javax.swing.JLabel();
        lblBtnMedio = new javax.swing.JLabel();
        lblNumPrg = new javax.swing.JLabel();
        lblRec2 = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblUseThis = new javax.swing.JLabel();
        lblSuper = new javax.swing.JLabel();
        lblRec1 = new javax.swing.JLabel();
        lblBtnMenu = new javax.swing.JLabel();
        lblRecPrg = new javax.swing.JLabel();
        lblLine = new javax.swing.JLabel();
        lblRecRes = new javax.swing.JLabel();
        lblBtnCheck = new javax.swing.JLabel();
        lblBtnDificil = new javax.swing.JLabel();
        lblBtnFacil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(144, 215, 155));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(825, 480));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
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
        getContentPane().add(miniMenuPnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));
        miniMenuPnl1.setVisible(false);

        jPanel1.setBackground(new java.awt.Color(144, 215, 155));
        jPanel1.setForeground(new java.awt.Color(144, 215, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(825, 480));
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResCheck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResCheck.setText("Esto es lo que dirán la respuesta");
        jPanel1.add(lblResCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 218, 31));
        lblResCheck.setVisible(false);

        lblBtnMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgMedio.png"))); // NOI18N
        lblBtnMedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnMedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnMedioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnMedioMouseExited(evt);
            }
        });
        jPanel1.add(lblBtnMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 304, -1, -1));
        lblBtnMedio.setVisible(false);
        jPanel1.add(lblNumPrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 76, 218, 31));

        lblRec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIngRec2.png"))); // NOI18N
        jPanel1.add(lblRec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, -1, -1));

        lblPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPreguntaMouseEntered(evt);
            }
        });
        lblPregunta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblPreguntaComponentShown(evt);
            }
        });
        jPanel1.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 138, 360, 26));

        jTextField1.setBackground(new java.awt.Color(217, 217, 217));
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 183, 190, 20));
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    ResUsuario = jTextField1.getText();
                    lblResCheck.setText(karta2.ElementosObj.ComprobarRespuesta(elemento, ResUsuario, TipoPregunta));
                    lblResCheck.setVisible(true);
                    lblBtnFacil.setVisible(true);
                    lblBtnMedio.setVisible(true);
                    lblBtnDificil.setVisible(true);

                }
            }
        });

        lblUseThis.setFont(new java.awt.Font("Segoe UI", 1, 128)); // NOI18N
        lblUseThis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUseThis.setText("H");
        jPanel1.add(lblUseThis, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 175, 132, 111));

        lblSuper.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblSuper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuper.setText("1");
        jPanel1.add(lblSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 151, -1, -1));

        lblRec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgRec1.png"))); // NOI18N
        jPanel1.add(lblRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, -1, -1));

        lblBtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgMenu.png"))); // NOI18N
        lblBtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnMenuMouseClicked(evt);
            }
        });
        jPanel1.add(lblBtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 27, -1, -1));

        lblRecPrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgPregunta.png"))); // NOI18N
        jPanel1.add(lblRecPrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 136, -1, -1));

        lblLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line 1.png"))); // NOI18N
        jPanel1.add(lblLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 204, -1, -1));

        lblRecRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgRecRes.png"))); // NOI18N
        jPanel1.add(lblRecRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 175, -1, -1));

        lblBtnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgCheck.png"))); // NOI18N
        lblBtnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCheckMouseClicked(evt);
            }
        });
        jPanel1.add(lblBtnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 181, -1, -1));

        lblBtnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgDificil.png"))); // NOI18N
        lblBtnDificil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnDificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnDificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnDificilMouseExited(evt);
            }
        });
        jPanel1.add(lblBtnDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 255, -1, -1));
        lblBtnDificil.setVisible(false);

        lblBtnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgFacil.png"))); // NOI18N
        lblBtnFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnFacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnFacilMouseExited(evt);
            }
        });
        jPanel1.add(lblBtnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 357, -1, -1));
        lblBtnFacil.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBarraMouseDragged

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

    private void lblBtnCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCheckMouseClicked
        InterfazResultados obj = new InterfazResultados();
        obj.setVisible(true);
        this.setVisible(false);
        // cuando le den click a le flechita rosita los va a mandar a la siguiente pregunta o a InterfazResultados
    }//GEN-LAST:event_lblBtnCheckMouseClicked

    private void lblBtnDificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDificilMouseEntered
        lblBtnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgDificil2.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnDificilMouseEntered

    private void lblBtnDificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDificilMouseExited
        lblBtnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgDificil.png")));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnDificilMouseExited

    private void lblBtnMedioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMedioMouseEntered
        lblBtnMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgMedio2.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnMedioMouseEntered

    private void lblBtnMedioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMedioMouseExited
        lblBtnMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgMedio.png")));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnMedioMouseExited

    private void lblBtnFacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnFacilMouseEntered
        lblBtnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgFacil2.png")));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnFacilMouseEntered

    private void lblBtnFacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnFacilMouseExited
        lblBtnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgFacil.png")));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnFacilMouseExited

    private void lblBtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnMenuMouseClicked
        if (miniMenuPnl1.isVisible()) {
            miniMenuPnl1.setVisible(false);
        } else {
            miniMenuPnl1.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnMenuMouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            lblResCheck.setVisible(true);
            lblBtnFacil.setVisible(true);
            lblBtnMedio.setVisible(true);
            lblBtnDificil.setVisible(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1PropertyChange

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        item = obj.DeterminarPreguntaIniciar(10);
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void lblPreguntaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblPreguntaComponentShown
        lblPregunta.setText(item.get(0).getTipoPregunta().getOracion());
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPreguntaComponentShown

    private void lblPreguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreguntaMouseEntered
        lblPregunta.setText(item.get(0).getTipoPregunta().getOracion());
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPreguntaMouseEntered

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
            java.util.logging.Logger.getLogger(InterfazPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPregunta().setVisible(true);
                item = ElementosObj.DeterminarPreguntaIniciar(10);
                for (int i = 0; i < item.size(); i++) {
                    lblPregunta.setText(item.get(i).getTipoPregunta().getOracion());
                    elemento = item.get(i).getElementoJugando();
                    TipoPregunta = item.get(i).getTipoPregunta();
                    System.out.println(item.get(i).getTipoPregunta());
                    
                }
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBtnCheck;
    private javax.swing.JLabel lblBtnDificil;
    private javax.swing.JLabel lblBtnFacil;
    private javax.swing.JLabel lblBtnMedio;
    private javax.swing.JLabel lblBtnMenu;
    private javax.swing.JLabel lblLine;
    public static javax.swing.JLabel lblNumPrg;
    public static javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRec1;
    private javax.swing.JLabel lblRec2;
    private javax.swing.JLabel lblRecPrg;
    private javax.swing.JLabel lblRecRes;
    private javax.swing.JLabel lblResCheck;
    private javax.swing.JLabel lblSuper;
    private javax.swing.JLabel lblUseThis;
    private Front.MiniMenuPnl miniMenuPnl1;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlBtnExit;
    // End of variables declaration//GEN-END:variables
}
