package Beans;

import java.util.Date;

public class Noticia {
    Integer Id;
    String Titulo;
    Date Fecha;
    String Contenido;
    String Fuente;
    String Imagen;

    public Noticia() {
    }

    public Noticia(Integer Id) {
        this.Id = Id;
    }

    public Noticia(Integer Id, String Titulo, Date Fecha, String Contenido, String Fuente, String Imagen) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Contenido = Contenido;
        this.Fuente = Fuente;
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

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getFuente() {
        return Fuente;
    }

    public void setFuente(String Fuente) {
        this.Fuente = Fuente;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
}
