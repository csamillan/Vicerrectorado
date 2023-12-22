package Negocio;

import Beans.Curso;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nCurso {

    public void Registrarcurso(Curso obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_curso(?";
            for (int i = 0; i < 8; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[9];
            param[0] = obean.getTitulo().toUpperCase();
            param[1] = obean.getFechaInicio();
            param[2] = obean.getFechaInicio();
            param[3] = obean.getHorario();
            param[4] = obean.getLugar();
            param[5] = obean.getOrganizador();
            param[6] = obean.getArea();
            param[7] = obean.getContenido();
            param[8] = obean.getEstado().toUpperCase();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void Modificarcurso(Curso obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT actualizar_curso(?";
            for (int i = 0; i < 9; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[10];
            param[0] = obean.getId();
            param[1] = obean.getTitulo().toUpperCase();
            param[2] = obean.getFechaInicio();
            param[3] = obean.getFechaInicio();
            param[4] = obean.getHorario();
            param[5] = obean.getLugar();
            param[6] = obean.getOrganizador();
            param[7] = obean.getArea();
            param[8] = obean.getContenido();
            param[9] = obean.getEstado().toUpperCase();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void Eliminarcurso(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_curso(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public List<Curso> Listarcursoes() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Curso> lista = new ArrayList<Curso>();
            lista.clear();
            cadena = "SELECT * FROM listar_tcurso()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Curso objeto = new Curso();
                objeto.setId(rs.getInt("id"));
                objeto.setTitulo(rs.getString("titulo"));
                objeto.setFechaInicio(rs.getDate("fechainicio"));
                objeto.setFechaFin(rs.getDate("fechafin"));
                objeto.setHorario(rs.getString("horario"));
                objeto.setLugar(rs.getString("lugar"));
                objeto.setOrganizador(rs.getString("organizador"));
                objeto.setArea(rs.getString("area"));
                objeto.setContenido(rs.getString("contenido"));
                objeto.setEstado(rs.getString("estado"));

                lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

}
