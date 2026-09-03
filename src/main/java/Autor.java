public class Autor extends Object{

    private String nombre;
    private String apellido;
    private String mail;
    private char genero;

    public Autor(String nombre, String apellido, String mail, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.genero = genero;
    }

    public Autor() {
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", genero=" + genero +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
