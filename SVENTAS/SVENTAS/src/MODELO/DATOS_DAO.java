
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DATOS_DAO  extends Conexion{
     public boolean login (DATOS dt){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT ID_EMPLEADO, US.USUARIO, US.CONTRASEÑA , NOMBRES, APELLIDOS, TELEFONO, EMAIL, DOMICILIO, CARGO, FOTO, ESTADO , PER.PERFIL, PER.VENTAS, PER.PRODUCTOS, PER.GESTORES FROM EMPLEADO \n" +
                     "INNER JOIN USUARIO AS US ON DNI=US.USUARIO\n" +
                     "INNER JOIN ESTADO AS ES ON ESTADO = ES.ID_ESTADO\n" +
                     "INNER JOIN PERMISOS AS PER ON DNI = PER.EMPLEADO WHERE USUARIO = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,dt.getUSUARIO());
            rs = ps.executeQuery();
            
            if(rs.next()){
                 if(dt.getCONTRASEÑA().equals(rs.getString(3))){
                    dt.setID_EMPLEADO(rs.getInt(1));
                    dt.setNOMBRES(rs.getString(4));
                    dt.setAPELLIDOS(rs.getString(5));
                    dt.setTELEFONO(rs.getString(6));
                    dt.setEMAIL(rs.getString(7));
                    dt.setDOMICILIO(rs.getString(8));
                    dt.setCARGO(rs.getString(9));
                    dt.setFOTO(rs.getString(10));
                    dt.setESTADO(rs.getString(11));
                    dt.setPERFIL(rs.getString(12));
                    dt.setVENTAS(rs.getString(13));
                    dt.setPRODUCTOS(rs.getString(14));
                    dt.setGESTORES(rs.getString(15));


                    return true;
                } else {
                    return false;
                }
            }  return false;

        } catch (SQLException ex) {
            Logger.getLogger(DATOS_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
