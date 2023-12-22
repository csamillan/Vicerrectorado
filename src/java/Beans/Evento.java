package Beans;

import java.util.Date;

public class Evento {
    Integer Id;
    String Titulo;
    Date Fecha;
    String Hora;
    String Lugar;
    String Contenido;
    String Imagen;

    public Evento() {
    }

    public Evento(Integer Id) {
        this.Id = Id;
    }

    public Evento(Integer Id, String Titulo, Date Fecha, String Hora, String Lugar, String Contenido, String Imagen) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Lugar = Lugar;
        this.Contenido = Contenido;
        this.Imagen = Imagen;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
}
