package Negocio;

import Beans.Bitacora;
import Beans.Facultad;
import Beans.Usuario;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nBitacora {
     public void RegistrarBitacora(Bitacora obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_bitacora(?";
            for (int i = 0; i < 2; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[3];
            param[0] = obean.getTabla().toUpperCase();
            param[1] = obean.getAccion().toUpperCase();
            param[2] = obean.getUsuario().getId();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
     public List<Bitacora> ListarBitacora() throws Exception{
        String cadena = "";
        ResultSet rs;
        try {
            List<Bitacora> lista = new ArrayList<Bitacora>();
            lista.clear();
            cadena = "SELECT * FROM listar_tbitacora()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Bitacora objeto=new Bitacora();
                objeto.setId(rs.getInt("id"));
                objeto.setTabla(rs.getString("tabla"));
                objeto.setAccion(rs.getString("accion"));
                objeto.setFecha(rs.getDate("fecha"));
                objeto.setUsuario(new Usuario(rs.getInt("usuarioid"), rs.getString("usuarionombre"), rs.getString("usuarioapellidop"), rs.getString("usuarioapellidom"), rs.getString("usuariodni"), rs.getString("usuariosexo"), rs.getString("usuariogrado"), rs.getString("usuariocargo"), rs.getString("usuariocorreo"), rs.getString("usuariocelular"), rs.getString("usuariocuenta"), rs.getString("usuarioclave"), rs.getString("usuariotipo"), new Facultad(rs.getInt("facultadid"), rs.getString("facultadnombre"), rs.getString("facultadabreviatura"))));
                
                 lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
}
