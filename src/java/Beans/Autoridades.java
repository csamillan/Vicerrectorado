package Beans;

public class Autoridades {
    Integer id;
    String Nombre;
    String Cargo;
    String AñoInicio;
    String Contenido;
    String Imagen;

    public Autoridades() {
    }

    public Autoridades(Integer id) {
        this.id = id;
    }

    public Autoridades(Integer id, String Nombre, String Cargo, String AñoInicio, String Contenido, String Imagen) {
        this.id = id;
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.AñoInicio = AñoInicio;
        this.Contenido = Contenido;
        this.Imagen = Imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getAñoInicio() {
        return AñoInicio;
    }

    public void setAñoInicio(String AñoInicio) {
        this.AñoInicio = AñoInicio;
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
