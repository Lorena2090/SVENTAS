package VISTA;

import MODELO.DATOS;

public final class PRINCIPAL extends javax.swing.JFrame {
    
     DATOS dt;

     public PRINCIPAL() {
        initComponents();
    }

     public PRINCIPAL (DATOS dt){
         initComponents();
         setLocationRelativeTo(null);
         this.dt = dt;
         FiltroUsuarios();
    }
    
    private void ListarDatos(){
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPRODUCTOS = new javax.swing.JButton();
        btnVENTAS = new javax.swing.JButton();
        btnPERFIL = new javax.swing.JButton();
        btnGESTORES = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPRODUCTOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/PRODUCTOS.png"))); // NOI18N
        jPanel1.add(btnPRODUCTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 152, 90, -1));

        btnVENTAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/VENTA.png"))); // NOI18N
        jPanel1.add(btnVENTAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 45, 90, 70));

        btnPERFIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/USUARIO.png"))); // NOI18N
        btnPERFIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPERFILActionPerformed(evt);
            }
        });
        jPanel1.add(btnPERFIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45, -1, -1));

        btnGESTORES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/CONFIGURACION.png"))); // NOI18N
        btnGESTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGESTORESActionPerformed(evt);
            }
        });
        jPanel1.add(btnGESTORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 152, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPERFILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPERFILActionPerformed
        PERFIL PF = new PERFIL(dt);
        PF.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPERFILActionPerformed

    private void btnGESTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGESTORESActionPerformed
      GESTORES GD = new GESTORES(dt);
      GD.setVisible(true);
      dispose();
    }//GEN-LAST:event_btnGESTORESActionPerformed

    
     public void FiltroUsuarios(){
       if (dt.getPERFIL().equals("Si")) {
             btnPERFIL.setEnabled(true);
             }
         else {
             btnPERFIL.setEnabled(false);
             }
             
         if (dt.getVENTAS().equals("Si")) {
             btnVENTAS.setEnabled(true);
             }
         else {
             btnVENTAS.setEnabled(false);
             }
          if (dt.getPRODUCTOS().equals("Si")){
             btnPRODUCTOS.setEnabled(true);
         }
         else {
             btnPRODUCTOS.setEnabled(false);
         }
         if (dt.getGESTORES().equals("Si")){
             btnGESTORES.setEnabled(true);
         }
         else {
             btnGESTORES.setEnabled(false);
         }
    }
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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGESTORES;
    private javax.swing.JButton btnPERFIL;
    private javax.swing.JButton btnPRODUCTOS;
    private javax.swing.JButton btnVENTAS;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
