package Beans;

import java.util.Date;

public class Curso {
    Integer Id;
    String Titulo;
    Date FechaInicio;
    Date FechaFin;
    String Horario;
    String Lugar;
    String Organizador;
    String Area;
    String Contenido;
    String Estado;

    public Curso() {
    }
    
    public Curso(Integer Id) {
        this.Id = Id;
    }

    public Curso(Integer Id, String Titulo, Date FechaInicio, Date FechaFin, String Horario, String Lugar, String Organizador, String Area, String Contenido, String Estado) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Horario = Horario;
        this.Lugar = Lugar;
        this.Organizador = Organizador;
        this.Area = Area;
        this.Contenido = Contenido;
        this.Estado = Estado;
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

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(String Organizador) {
        this.Organizador = Organizador;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
        
}
