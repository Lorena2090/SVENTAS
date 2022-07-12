
package VISTA;

import MODELO.DATOS;
import MODELO.DATOS_DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MODELO.Conexion;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class GESTIONAR_USUARIOS extends javax.swing.JFrame {
        DATOS dt;
        DATOS dt_DAO;
        String Ruta = "";
        Conexion con = new Conexion();
        Connection cn = con.getConexion();
        static ResultSet rs;
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps;
        String Activo;
        private TableRowSorter trsfiltro;
        String filtro;
        static String  ID_EMPLEADO = ""; 
        String ComboBoxxx;
 
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtruta = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrarImagen = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnMenu1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Imagenes = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 255, -1));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 255, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombres");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Celular");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 252, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("E-mail");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 252, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 252, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Direccion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel2.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 255, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cargo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 255, -1));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 255, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 255, -1));
        jPanel2.add(txtruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 250, -1));
        jPanel2.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 250, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Ruta");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo", "Todos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, -1));

        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        Tabla_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Contraseña", "Nombres", "Apellidos", "Direccion", "Email", "Cargo", "Celular", "Foto", "Estado"
            }
        ));
        Tabla_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Usuarios);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnMostrarImagen.setText("MOSTRAR IMAGEN");
        btnMostrarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarImagenActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMenu1.setText("ATRAS");
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1158, 1158, 1158)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrarImagen)
                                .addGap(18, 18, 18)
                                .addComponent(btnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostrarImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jScrollPane5.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public GESTIONAR_USUARIOS(){
        initComponents();
    }
    
     public GESTIONAR_USUARIOS(DATOS dt) {
        this.dt = dt;
        initComponents();    
        setLocationRelativeTo(null);
        txtID.setVisible(false);
        mostrarUsuario();
        txtBuscar.addKeyListener(new KeyAdapter(){
     public void keyReleased(final KeyEvent e) { String cadena = (txtBuscar.getText()); txtBuscar.setText(cadena);filtro();}});
     }
     
     public void mostrarUsuario() {
        DefaultTableModel modelo = MostrarUsuarios();
        Tabla_Usuarios.setModel(modelo);
     }
     
     public  DefaultTableModel MostrarUsuarios() {
        String ComboBox = (String) jComboBox1.getSelectedItem();
        String sql;
       
        String []  nombresColumnas = {"ID","Usuario","Contraseña","Nombre","Apellidos","Direccion","Celular","Correo", "Cargo", "Foto","Estado"};
        if (null == ComboBox){  sql = "SELECT ID_EMPLEADO, US.USUARIO, US.CONTRASEÑA , NOMBRES, APELLIDOS, DOMICILIO, TELEFONO, EMAIL, CARGO, FOTO, ESTADO FROM EMPLEADO \n" +
                            "INNER JOIN USUARIO AS US ON DNI=US.USUARIO WHERE estado= '1'";;
        }
        else switch (ComboBox) {
                case "Activo":
                    sql = "SELECT ID_EMPLEADO, US.USUARIO, US.CONTRASEÑA , NOMBRES, APELLIDOS, DOMICILIO, TELEFONO, EMAIL,  CARGO, FOTO, ESTADO FROM EMPLEADO \n" +
                            "INNER JOIN USUARIO AS US ON DNI=US.USUARIO WHERE estado= '1'";
                    break;
                case "No Activo":
                    sql = "SELECT ID_EMPLEADO, US.USUARIO, US.CONTRASEÑA , NOMBRES, APELLIDOS, DOMICILIO, TELEFONO, EMAIL,  CARGO, FOTO, ESTADO FROM EMPLEADO \n" +
                            "INNER JOIN USUARIO AS US ON DNI=US.USUARIO WHERE estado= '2'";;
                    break;
                default:
                    sql = "SELECT ID_EMPLEADO, US.USUARIO, US.CONTRASEÑA , NOMBRES, APELLIDOS, DOMICILIO, TELEFONO, EMAIL,  CARGO, FOTO, ESTADO FROM EMPLEADO \n" +
                            "INNER JOIN USUARIO AS US ON DNI=US.USUARIO";
                    break;
            }
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
       
        String [] registros = new String[11];
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
          try
          { 
            cn = con.getConexion();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
          
            while(rs.next())
             {
                registros[0] = rs.getString("ID_EMPLEADO");
                registros[1] = rs.getString("USUARIO");
                registros[2] = rs.getString("CONTRASEÑA");
                registros[3] = rs.getString("NOMBRES");
                registros[4] = rs.getString("APELLIDOS");
                registros[5] = rs.getString("DOMICILIO");
                registros[6] = rs.getString("TELEFONO");
                registros[7] = rs.getString("EMAIL");
                registros[8] = rs.getString("CARGO");
                registros[9] = rs.getString("FOTO");
                registros[10] = rs.getString("ESTADO");
                
                modelo.addRow(registros);
             }
         }
        catch(SQLException e)
         {
            JOptionPane.showMessageDialog(null,"Error al conectar");
         }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return modelo;
    }
     
     public void VerMiImagen(){
        String ImagenMostrar = txtruta.getText();
        ImageIcon imagen = new ImageIcon(ImagenMostrar);//D:\DERONG 2021-12\1106-017.jpg //'" + ImagenMostrar +"'
        Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(Imagenes.getWidth(),Imagenes.getHeight(),Image.SCALE_SMOOTH));
        Imagenes.setIcon(icono);
      
    }
     
     public void LimpiarDatos(){
         txtID.setText(null);
         txtUsuario.setText(null);
         txtContraseña.setText(null);
         txtNombres.setText(null);
         txtApellidos.setText(null);
         txtDireccion.setText(null);
         txtCorreo.setText(null);
         txtCelular.setText(null);
         txtCargo.setText(null);
         txtruta.setText(null);
         txtEstado.setText(null);
     }
     
     public void Registrar_Permisos(){
      try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO PERMISOS(EMPLEADO,PERFIL,VENTAS,PRODUCTOS,GESTORES,ID_ESTADO)"
                    + "VALUES (?,?,?,?,?,?)");
               //SOLAMENTE SE ENVIA AL USUARIO PARA PODER TENER UN REGISTRO ASIGNADO
               ps.setString(1, txtUsuario.getText());
               //SE ENVIA VALORES VACIOS A LAS COLUMNAS PARA POSTERIORMENTE SER MODIFICADAS
               ps.setString(2, ""); 
               ps.setString(3, "");
               ps.setString(4, "");
               ps.setString(5, "");
               ps.setString(6, "");
               

               ps.executeUpdate();

             }  catch (SQLException ex) {
                    Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
             }        
                mostrarUsuario();
    
}    
    
     public void filtro(){
         filtro = txtBuscar.getText();
         trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 1,2,3));
     }

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
         JFileChooser fileChooser = new JFileChooser();
         FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
             if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                 Ruta = fileChooser.getSelectedFile().getAbsolutePath();
        Image mImagen = new ImageIcon(Ruta).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(Imagenes.getWidth(), Imagenes.getHeight(), 0));
                 Imagenes.setIcon(mIcono);
             String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                 txtruta.setText(ruta);
    }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    public void Registrar_Usuario(){
               try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO USUARIO(USUARIO,CONTRASEÑA,ID_ESTADO) "
                    + "VALUES (?,?,?)");
               
               ps.setString(1, txtUsuario.getText());
               String Contraseña = txtContraseña.getText();
               String ContraseñaBase64 = Base64.getEncoder().encodeToString(Contraseña.getBytes());
               ps.setString(2, ContraseñaBase64);
               ps.setString(3, "1");
              
               
               ps.executeUpdate();

            }  catch (SQLException ex) {
                    Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
    
    public void Registrar_Empleado(){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO EMPLEADO(DNI,NOMBRES,APELLIDOS,TELEFONO,EMAIL,DOMICILIO,CARGO,FOTO,ESTADO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)");
               
               ps.setString(1,txtUsuario.getText());
               ps.setString(2, txtNombres.getText());
               ps.setString(3, txtApellidos.getText());
               ps.setString(4, txtCelular.getText());
               ps.setString(5, txtCorreo.getText());
               ps.setString(6, txtDireccion.getText());
               ps.setString(7, txtCargo.getText());
               ps.setString(8, txtruta.getText());
               ps.setString(9, txtEstado.getText());
              
               
               ps.executeUpdate();

            }  catch (SQLException ex) {
                    Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         Registrar_Usuario();
         Registrar_Empleado();
         Registrar_Permisos();
         MostrarUsuarios();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
         trsfiltro = new TableRowSorter(Tabla_Usuarios.getModel());
         Tabla_Usuarios.setRowSorter(trsfiltro);
         LimpiarDatos();
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         LimpiarDatos();      
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          try {
             PreparedStatement ps = cn.prepareStatement("UPDATE EMPLEADO SET NOMBRES=?, APELLIDOS=?, "
                 + "TELEFONO=?,EMAIL=?,DOMICILIO=?,CARGO=? ,FOTO=?, ESTADO=? WHERE ID_EMPLEADO='" + txtID.getText() +"'");
              
                 ps.setString(1, txtNombres.getText());
                 ps.setString(2, txtApellidos.getText());
                 ps.setString(3, txtCelular.getText());
                 ps.setString(4, txtCorreo.getText());
                 ps.setString(5, txtDireccion.getText());     
                 ps.setString(6, txtCargo.getText());
                 ps.setString(7, txtruta.getText());
                 ps.setString(8, txtEstado.getText());

                 ps.executeUpdate();}
         
         catch (SQLException ex) {
                     Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            }   
          mostrarUsuario();
             
    }//GEN-LAST:event_btnModificarActionPerformed

    private void Tabla_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_UsuariosMouseClicked
 int fila = Tabla_Usuarios.rowAtPoint(evt.getPoint());
         txtID.setText(Tabla_Usuarios.getValueAt(fila, 0).toString());
         txtUsuario.setText(Tabla_Usuarios.getValueAt(fila, 1).toString());
         txtContraseña.setText(Tabla_Usuarios.getValueAt(fila, 2).toString());
         txtNombres.setText(Tabla_Usuarios.getValueAt(fila, 3).toString());
         txtApellidos.setText(Tabla_Usuarios.getValueAt(fila, 4).toString());
         txtDireccion.setText(Tabla_Usuarios.getValueAt(fila, 5).toString());
         txtCelular.setText(Tabla_Usuarios.getValueAt(fila, 6).toString());
         txtCorreo.setText(Tabla_Usuarios.getValueAt(fila, 7).toString());
         txtCargo.setText(Tabla_Usuarios.getValueAt(fila, 8).toString());
         txtruta.setText(Tabla_Usuarios.getValueAt(fila, 9).toString());
         txtEstado.setText(Tabla_Usuarios.getValueAt(fila, 10).toString());
          
         VerMiImagen();
    }//GEN-LAST:event_Tabla_UsuariosMouseClicked

    private void btnMostrarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarImagenActionPerformed
        ID_EMPLEADO = txtruta.getText();
        IMG Imagen = new IMG(dt);
        Imagen.setVisible(true);
    }//GEN-LAST:event_btnMostrarImagenActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try {
             PreparedStatement ps = cn.prepareStatement("UPDATE EMPLEADO SET ESTADO=? where ID_EMPLEADO='" + txtID.getText() +"'");
                 
                 ps.setString(1, "2");

                 ps.executeUpdate();}
                 
         
         catch (SQLException ex) {
                     Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            }   
          mostrarUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       mostrarUsuario();       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
   
    }//GEN-LAST:event_btnMenu1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GESTIONAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GESTIONAR_USUARIOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagenes;
    private javax.swing.JTable Tabla_Usuarios;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnMostrarImagen;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables
}
