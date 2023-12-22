package Negocio;

import Beans.Facultad;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nFacultad {

    public void RegistrarFacultad(Facultad obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_facultad(?";
            for (int i = 0; i < 1; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[2];
            param[0] = obean.getNombre().toUpperCase();
            param[1] = obean.getAbreviatura().toUpperCase();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void ModificarFacultad(Facultad obean) throws Exception{
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_facultad(?";
            for (int i = 0; i < 2; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[3];
            param[0] = obean.getId();
            param[1] = obean.getNombre().toUpperCase();
            param[2] = obean.getAbreviatura().toUpperCase();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public void EliminarFacultad(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_facultad(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }
    
    public List<Facultad> ListarFacultades() throws Exception{
        String cadena = "";
        ResultSet rs;
        try {
            List<Facultad> lista = new ArrayList<Facultad>();
            lista.clear();
            cadena = "SELECT * FROM listar_tfacultad()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Facultad objeto=new Facultad();
                objeto.setId(rs.getInt("id"));
                objeto.setNombre(rs.getString("nombre"));
                objeto.setAbreviatura(rs.getString("abreviatura"));
                
                 lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
}
