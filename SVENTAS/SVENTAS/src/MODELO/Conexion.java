
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
        Connection con;

    public Connection getConexion() {
        try {
           String db = "jdbc:sqlserver://192.168.0.106:1433;databaseName=BD_SV";
            con = DriverManager.getConnection(db, "sa", "GianfrancoBL2202");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}
