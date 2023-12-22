package Negocio;

import Beans.Noticia;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nNoticia {
    public void RegistrarNoticia(Noticia obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_noticia(?";
            for (int i = 0; i < 4; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[5];
            param[0] = obean.getTitulo().toUpperCase();
            param[1] = obean.getFecha();
            param[2] = obean.getContenido();
            param[3] = obean.getFuente().toUpperCase();
            param[4] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void ModificarNoticia(Noticia obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_noticia(?";
            for (int i = 0; i < 5; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[6];
            param[0] = obean.getId();
            param[1] = obean.getTitulo().toUpperCase();
            param[2] = obean.getFecha();
            param[3] = obean.getContenido();
            param[4] = obean.getFuente().toUpperCase();
            param[5] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void EliminarNoticia(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_noticia(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public List<Noticia> ListarNoticiaes() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Noticia> lista = new ArrayList<Noticia>();
            lista.clear();
            cadena = "SELECT * FROM listar_tnoticia()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Noticia objeto = new Noticia();
                objeto.setId(rs.getInt("id"));
                objeto.setTitulo(rs.getString("titulo"));
                objeto.setFecha(rs.getDate("fecha"));
                objeto.setContenido(rs.getString("contenido"));
                objeto.setFuente(rs.getString("fuente"));
                objeto.setImagen(rs.getString("imagen"));
                
                lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
}
