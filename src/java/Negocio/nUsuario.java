package Negocio;

import Beans.Facultad;
import Beans.Usuario;
import CADO.CADO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class nUsuario {

    public void RegistrarUsuario(Usuario obean) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT insertar_usuario(?";
            for (int i = 0; i < 12; i++) {
                cadena = cadena + ",?";
            }
            cadena = cadena + ")";
            Object param[] = new Object[13];
            param[0] = obean.getNombre().toUpperCase();
            param[1] = obean.getApellidoP().toUpperCase();
            param[2] = obean.getApellidoM().toUpperCase();
            param[3] = obean.getDni().toUpperCase();
            param[4] = obean.getSexo().toUpperCase();
            param[5] = obean.getGradoAcademico().toUpperCase();
            param[6] = obean.getCargo().toUpperCase();
            param[7] = obean.getCorreo();
            param[8] = obean.getCelular();
            param[9] = obean.getCuenta();
            param[10] = obean.getClave();
            param[11] = obean.getTipo();
            param[12] = obean.getFacultad().getId();

            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public List<Usuario> ListarUsuarios() throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Usuario> lista = new ArrayList<Usuario>();
            lista.clear();
            cadena = "SELECT * FROM listar_tusuario()";
            CADO ocado = new CADO();
            rs = ocado.RecuperaProc(cadena);
            rs.beforeFirst();
            while (rs.next()) {
                Usuario objeto = new Usuario();

                objeto.setId(rs.getInt("id"));
                objeto.setNombre(rs.getString("nombre"));
                objeto.setApellidoP(rs.getString("apellidop"));
                objeto.setApellidoM(rs.getString("apellidom"));
                objeto.setDni(rs.getString("dni"));
                objeto.setSexo(rs.getString("grado"));
                objeto.setGradoAcademico(rs.getString("grado"));
                objeto.setCargo(rs.getString("cargo"));
                objeto.setCorreo(rs.getString("correo"));
                objeto.setCelular(rs.getString("celular"));
                objeto.setCuenta(rs.getString("cuenta"));
                objeto.setClave(rs.getString("clave"));
                objeto.setTipo(rs.getString("tipo"));
                objeto.setFacultad(new Facultad(rs.getInt("facultadid"), rs.getString("facultadnombre"), rs.getString("facultadabreviatura")));

                lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Usuario> BuscarUsuarios(Integer id) throws Exception {
        String cadena = "";
        ResultSet rs;
        try {
            List<Usuario> lista = new ArrayList<Usuario>();
            lista.clear();
            cadena = "SELECT * FROM listar_usuario(?)";
            CADO ocado = new CADO();
            Object param[] = new Object[1];
            param[0] = id;
            rs = ocado.RecuperaProc(cadena, param);
            rs.beforeFirst();
            while (rs.next()) {
                Usuario objeto = new Usuario();

                objeto.setId(rs.getInt("id"));
                objeto.setNombre(rs.getString("nombre"));
                objeto.setApellidoP(rs.getString("apellidop"));
                objeto.setApellidoM(rs.getString("apellidom"));
                objeto.setDni(rs.getString("dni"));
                objeto.setSexo(rs.getString("grado"));
                objeto.setGradoAcademico(rs.getString("grado"));
                objeto.setCargo(rs.getString("cargo"));
                objeto.setCorreo(rs.getString("correo"));
                objeto.setCelular(rs.getString("celular"));
                objeto.setCuenta(rs.getString("cuenta"));
                objeto.setClave(rs.getString("clave"));
                objeto.setTipo(rs.getString("tipo"));
                objeto.setFacultad(new Facultad(rs.getInt("facultadid"), rs.getString("facultadnombre"), rs.getString("facultadabreviatura")));

                lista.add(objeto);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void Eliminar(Integer id) throws Exception {
        String cadena = "";
        CADO ocado = new CADO();
        try {
            cadena = "SELECT eliminar_usuario(?)";
            Object param[] = new Object[1];
            param[0] = id;
            ocado.EjecutaProc(cadena, param);
        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

    public void ModificarUsuario(Usuario obean) throws Exception {
        String Cadena = "";
        CADO ocado = new CADO();
        try {
            Cadena = "select actualizar_usuario(?";
            for (int i = 0; i < 14; i++) {
                Cadena = Cadena + ",?";
            }
            Cadena = Cadena + ")";
            Object param[] = new Object[14];
            param[0] = obean.getId();
            param[1] = obean.getNombre().toUpperCase();
            param[2] = obean.getApellidoP().toUpperCase();
            param[3] = obean.getApellidoM().toUpperCase();
            param[4] = obean.getDni().toUpperCase();
            param[5] = obean.getSexo().toUpperCase();
            param[6] = obean.getGradoAcademico().toUpperCase();
            param[7] = obean.getCargo().toUpperCase();
            param[8] = obean.getCorreo();
            param[9] = obean.getCelular();
            param[10] = obean.getCuenta();
            param[11] = obean.getClave();
            param[12] = obean.getTipo();
            param[13] = obean.getFacultad().getId();

            ocado.EjecutaProc(Cadena, param);

        } catch (Exception e) {
            throw e;
        } finally {
            ocado.CerrarSeccion();
        }
    }

}
