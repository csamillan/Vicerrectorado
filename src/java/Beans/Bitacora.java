package Beans;

import java.util.Date;

public class Bitacora {
    
    Integer Id;
    String Tabla;
    String Accion;
    Date Fecha;
    Usuario Usuario;

    public Bitacora() {
    }

    public Bitacora(Integer Id) {
        this.Id = Id;
    }

    public Bitacora(Integer Id, String Tabla, String Accion, Date Fecha, Usuario Usuario) {
        this.Id = Id;
        this.Tabla = Tabla;
        this.Accion = Accion;
        this.Fecha = Fecha;
        this.Usuario = Usuario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTabla() {
        return Tabla;
    }

    public void setTabla(String Tabla) {
        this.Tabla = Tabla;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
       
}
