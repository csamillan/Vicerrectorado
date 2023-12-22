package Negocio;

import Beans.Slider;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nSlider {

    public void RegistrarSlider(Slider obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_slider(?";
            for (int i = 0; i < 2; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[3];
            param[0] = obean.getTitulo().toUpperCase();
            param[1] = obean.getDescripcion().toUpperCase();
            param[2] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void ModificarSlider(Slider obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_slider(?";
            for (int i = 0; i < 3; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[4];
            param[0] = obean.getId();
            param[1] = obean.getTitulo().toUpperCase();
            param[2] = obean.getDescripcion().toUpperCase();
            param[3] = obean.getImagen();
            
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void EliminarSlider(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_slider(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public List<Slider> Listarslideres() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Slider> lista = new ArrayList<Slider>();
            lista.clear();
            cadena = "SELECT * FROM listar_tslider()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Slider objeto = new Slider();
                objeto.setId(rs.getInt("id"));
                objeto.setTitulo(rs.getString("titulo"));
                objeto.setDescripcion(rs.getString("descripcion"));
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
