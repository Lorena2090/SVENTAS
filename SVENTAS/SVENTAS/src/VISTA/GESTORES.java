
package VISTA;

import MODELO.DATOS;


public class GESTORES extends javax.swing.JFrame {

    DATOS dt;
    
    public GESTORES() {
        initComponents();
    }
    
    public GESTORES(DATOS dt){
         setLocationRelativeTo(null);
         this.dt = dt;
         initComponents();
         setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGestionarUsuarios = new javax.swing.JButton();
        btnEquipos = new javax.swing.JButton();
        btnGestionarPermisos = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionarUsuarios.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnGestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/G_USUARIOS.png"))); // NOI18N
        btnGestionarUsuarios.setText("GESTIONAR USUARIOS");
        btnGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, 86));

        btnEquipos.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/G_PRODUCTOS.png"))); // NOI18N
        btnEquipos.setText("GESTIONAR PRODUCTOS");
        btnEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 430, 80));

        btnGestionarPermisos.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnGestionarPermisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/G_PERMISOS.png"))); // NOI18N
        btnGestionarPermisos.setText("GESTIONAR PERMISOS");
        btnGestionarPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPermisosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 430, 86));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/RETROCEDER.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuariosActionPerformed
     GESTIONAR_USUARIOS G_USUARIO = new GESTIONAR_USUARIOS(dt);
     G_USUARIO.setVisible(true);
    }//GEN-LAST:event_btnGestionarUsuariosActionPerformed

    private void btnEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiposActionPerformed
      GESTIONAR_PRODUCTOS GP = new GESTIONAR_PRODUCTOS();
      GP.setVisible(true);
    }//GEN-LAST:event_btnEquiposActionPerformed

    private void btnGestionarPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPermisosActionPerformed
  
    }//GEN-LAST:event_btnGestionarPermisosActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        PRINCIPAL PP = new PRINCIPAL(dt);
        PP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


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
            java.util.logging.Logger.getLogger(GESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GESTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GESTORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEquipos;
    public javax.swing.JButton btnGestionarPermisos;
    public javax.swing.JButton btnGestionarUsuarios;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
