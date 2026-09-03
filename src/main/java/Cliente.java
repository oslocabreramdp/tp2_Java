import java.util.Objects;
import java.util.UUID;

public class Cliente {

    public static int BASE =0;
    public static int TOPE =15;


    private String id_cliente;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.id_cliente=UUID.randomUUID().toString().substring(BASE, TOPE)
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public Cliente() {
        this.id_cliente=UUID.randomUUID().toString().substring(BASE, TOPE);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static int getBASE() {
        return BASE;
    }

    public static int getTOPE() {
        return TOPE;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente='" + id_cliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(id_cliente, cliente.id_cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_cliente);
    }


}
