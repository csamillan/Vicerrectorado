package Negocio;

import Beans.Evento;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nEvento {
    public void RegistrarEvento(Evento obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_evento(?";
            for (int i = 0; i < 5; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[6];
            param[0] = obean.getTitulo().toUpperCase();
            param[1] = obean.getFecha();
            param[2] = obean.getHora();
            param[3] = obean.getLugar();
            param[4] = obean.getContenido();
            param[5] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void Modificarevento(Evento obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_evento(?";
            for (int i = 0; i < 6; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[7];
            param[0] = obean.getId();
            param[1] = obean.getTitulo().toUpperCase();
            param[2] = obean.getFecha();
            param[3] = obean.getHora();
            param[4] = obean.getLugar();
            param[5] = obean.getContenido();
            param[6] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void Eliminarevento(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_evento(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public List<Evento> ListarEventoes() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Evento> lista = new ArrayList<Evento>();
            lista.clear();
            cadena = "SELECT * FROM listar_tevento()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Evento objeto = new Evento();
                objeto.setId(rs.getInt("id"));
                objeto.setTitulo(rs.getString("titulo"));
                objeto.setFecha(rs.getDate("fecha"));
                objeto.setHora(rs.getString("hora"));
                objeto.setLugar(rs.getString("lugar"));
                objeto.setContenido(rs.getString("contenido"));
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
