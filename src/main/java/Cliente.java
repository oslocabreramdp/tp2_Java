import java.util.Objects;
import java.util.UUID;

public class Cliente {

    private static final int BASE =0;
    private static final int TOPE =13;


    private String idCliente;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.idCliente=UUID.randomUUID().toString().substring(BASE, TOPE);
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public Cliente() {
        this.idCliente=UUID.randomUUID().toString().substring(BASE, TOPE);
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

    public String getIdCliente() {
        return idCliente;
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
        return "Cliente[id= " + idCliente +
                ", nombre= " + nombre +
                ", email= " + email +
                ", descuento=" + descuento +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(idCliente, cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCliente);
    }


}
