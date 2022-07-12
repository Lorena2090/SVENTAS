
package VISTA;

import MODELO.Conexion;
import MODELO.DATOS;
import MODELO.DATOS_DAO;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class PERFIL extends javax.swing.JFrame {
     DATOS dt; 
     String Ruta = "";
     Conexion con = new Conexion();
     Connection cn = con.getConexion();
     static ResultSet rs;
     //String ImagenMostrar = txtMiDireccion.getText();
  
    public PERFIL(){
     initComponents(); 
    }
  
    public PERFIL(DATOS dt) {
    this.dt = dt;
      initComponents();
      setLocationRelativeTo(null);
      ListarDatos();
      VerMiImagen();
      txtUrlI_Abrir.setVisible(false); //OCULTO EL TEXT FIELD DONDE CAPTURO LA URL DE LA IMAGEN
      txtID.setVisible(false);
      setPreferredSize(new Dimension(400,400));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnActualizarDatos = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        txtRuta_Seleccionar = new javax.swing.JTextField();
        txtUrlI_Abrir = new javax.swing.JTextField();
        Imagen_Perfil = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/RETROCEDER.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Celular");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("E-mail");

        btnActualizarDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarDatos.setText("Actualizar Mis Datos");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cargo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnActualizarDatos)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnActualizarDatos)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 311, -1, -1));
        jPanel1.add(txtRuta_Seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 314, 177, 30));
        jPanel1.add(txtUrlI_Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 300, -1));

        Imagen_Perfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Imagen_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 12, 310, 281));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void ListarDatos(){
         DATOS_DAO usDAO = new DATOS_DAO();
        usDAO.login(dt);
         int id = dt.getID_EMPLEADO();
         String valor = String.valueOf(id);    
         txtID.setText(valor);
         txtNombres.setText(dt.getNOMBRES());
         txtApellidos.setText(dt.getAPELLIDOS());
         txtDireccion.setText(dt.getDOMICILIO());
         txtCelular.setText(dt.getTELEFONO());
         txtCorreo.setText(dt.getEMAIL());
         txtCargo.setText(dt.getCARGO());
         txtUrlI_Abrir.setText(dt.getFOTO());
    }
    
    public void VerMiImagen(){
        String ImagenMostrar = txtUrlI_Abrir.getText();
        ImageIcon imagen = new ImageIcon(ImagenMostrar);//D:\DERONG 2021-12\1106-017.jpg //'" + ImagenMostrar +"'
        Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(Imagen_Perfil.getWidth(),Imagen_Perfil.getHeight(),Image.SCALE_SMOOTH));
        Imagen_Perfil.setIcon(icono);
    }
    
    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
     PRINCIPAL PP = new PRINCIPAL(dt);
     PP.setVisible(true);
     dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
         JFileChooser fileChooser = new JFileChooser();
         FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
             if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                 Ruta = fileChooser.getSelectedFile().getAbsolutePath();
        Image mImagen = new ImageIcon(Ruta).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(Imagen_Perfil.getWidth(), Imagen_Perfil.getHeight(), 0));
                 Imagen_Perfil.setIcon(mIcono);
             String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                 txtRuta_Seleccionar.setText(ruta);
         }         
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed

         try {
             PreparedStatement ps = cn.prepareStatement("UPDATE EMPLEADO SET NOMBRES=?, APELLIDOS=?, "
                 + "TELEFONO=?,EMAIL=?,DOMICILIO=?,CARGO=? ,FOTO=? WHERE ID_EMPLEADO='" + dt.getID_EMPLEADO() +"'");
                 ps.setString(1, txtNombres.getText());
                 ps.setString(2, txtApellidos.getText());
                 ps.setString(3, txtCelular.getText());
                 ps.setString(4, txtCorreo.getText());
                 ps.setString(5, txtDireccion.getText());     
                 ps.setString(6, txtCargo.getText());
                
                 if (txtRuta_Seleccionar.getText().equals("") && !"".equals(txtUrlI_Abrir.getText())){
                      ps.setString(7, txtUrlI_Abrir.getText());
                 } else if (!"".equals(txtUrlI_Abrir.getText()) && !"".equals(txtUrlI_Abrir.getText())){
                      ps.setString(7, txtRuta_Seleccionar.getText());
                 } else if (txtRuta_Seleccionar.getText().equals("") && txtUrlI_Abrir.getText().equals("")){
                      ps.setString(7, txtRuta_Seleccionar.getText());
                 } else {
                     ps.setString(7, txtRuta_Seleccionar.getText());
                 }
               
                 ps.executeUpdate();}
         
         catch (SQLException ex) {
                    // Logger.getLogger(Gestionar_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }   
         DATOS_DAO usDAO = new DATOS_DAO();
         usDAO.login(dt);
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(PERFIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERFIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERFIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERFIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PERFIL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_Perfil;
    public javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRuta_Seleccionar;
    private javax.swing.JTextField txtUrlI_Abrir;
    // End of variables declaration//GEN-END:variables
}
