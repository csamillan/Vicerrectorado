package Beans;

public class Slider {
    Integer Id;
    String Titulo;
    String Descripcion;
    String Imagen;

    public Slider() {
    }

    public Slider(Integer Id) {
        this.Id = Id;
    }

    public Slider(Integer Id, String Titulo, String Descripcion, String Imagen) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
       
}
