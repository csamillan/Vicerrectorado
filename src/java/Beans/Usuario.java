package Beans;

public class Usuario {
    Integer Id;
    String Nombre;
    String ApellidoP;
    String ApellidoM;
    String Dni;
    String Sexo;
    String GradoAcademico;
    String Cargo;
    String Correo;
    String Celular;
    String Cuenta;
    String Clave;
    String Tipo;
    Facultad Facultad;

    public Usuario() {
    }

    public Usuario(Integer Id) {
        this.Id = Id;
    }

    public Usuario(Integer Id, String Nombre, String ApellidoP, String ApellidoM, String Dni, String Sexo, String GradoAcademico, String Cargo, String Correo, String Celular, String Cuenta, String Clave, String Tipo, Facultad Facultad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Dni = Dni;
        this.Sexo = Sexo;
        this.GradoAcademico = GradoAcademico;
        this.Cargo = Cargo;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Cuenta = Cuenta;
        this.Clave = Clave;
        this.Tipo = Tipo;
        this.Facultad = Facultad;
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

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Facultad getFacultad() {
        return Facultad;
    }

    public void setFacultad(Facultad Facultad) {
        this.Facultad = Facultad;
    }
    
    
    
}
