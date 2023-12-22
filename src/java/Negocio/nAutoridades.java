package Negocio;

import Beans.Autoridades;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nAutoridades {

    public void RegistrarAutoridades(Autoridades obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_autoridades(?";
            for (int i = 0; i < 4; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[5];
            param[0] = obean.getNombre();
            param[1] = obean.getCargo().toUpperCase();
            param[2] = obean.getAñoInicio();
            param[3] = obean.getContenido();
            param[4] = obean.getImagen();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void ModificarAutoridades(Autoridades obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_autoridades(?";
            for (int i = 0; i < 5; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[6];
            param[0] = obean.getId();
            param[1] = obean.getNombre();
            param[2] = obean.getCargo().toUpperCase();
            param[3] = obean.getAñoInicio();
            param[4] = obean.getContenido();
            param[5] = obean.getImagen();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void EliminarAutoridades(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_autoridades(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public List<Autoridades> ListarAutoridades() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Autoridades> lista = new ArrayList<Autoridades>();
            lista.clear();
            cadena = "SELECT * FROM listar_tautoridades()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Autoridades objeto = new Autoridades();
                objeto.setId(rs.getInt("id"));
                objeto.setNombre(rs.getString("nombre"));
                objeto.setCargo(rs.getString("cargo"));
                objeto.setContenido(rs.getString("contenido"));
                objeto.setAñoInicio(rs.getString("anoinicio"));
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
