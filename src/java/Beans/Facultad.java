package Beans;

public class Facultad {
    Integer Id;
    String Nombre;
    String Abreviatura;

    public Facultad() {
    }

    public Facultad(Integer Id) {
        this.Id = Id;
    }

    public Facultad(Integer Id, String Nombre, String Abreviatura) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Abreviatura = Abreviatura;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura) {
        this.Abreviatura = Abreviatura;
    }
    
}
