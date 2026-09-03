import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;
import java.time.LocalDateTime

public class Factura {

    LocalDateTime fechaActual = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy --- HH:mm:ss");

    private String id_factura;
    private Cliente realiza_compra;
    private String fecha;
    private double  monto_compra;

    public Factura(Cliente realiza_compra, double monto_compra) {
        this.id_factura=UUID.randomUUID().toString().substring(realiza_compra.getBASE(),realiza_compra.getTOPE());
        this.fecha = fechaActual.format(formato);
        this.realiza_compra = realiza_compra;
        this.monto_compra = monto_compra;
    }

    public Factura() {
        this.id_factura=UUID.randomUUID().toString().substring(realiza_compra.getBASE(),realiza_compra.getTOPE());
        this.fecha = fechaActual.format(formato);
    }

    public void setRealiza_compra(Cliente realiza_compra) {
        this.realiza_compra = realiza_compra;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto_compra(double monto_compra) {
        this.monto_compra = monto_compra;
    }

    public String getId_factura() {
        return id_factura;
    }

    public Cliente getRealiza_compra() {
        return realiza_compra;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMonto_compra() {
        return monto_compra;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id_factura='" + id_factura + '\'' +
                ", realiza_compra=" + realiza_compra +
                ", fecha='" + fecha + '\'' +
                ", monto_compra=" + monto_compra +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Factura factura)) return false;
        return Objects.equals(id_factura, factura.id_factura) && Objects.equals(realiza_compra, factura.realiza_compra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_factura, realiza_compra);
    }

    public double monto_a_cobrar(){
        return monto_compra*(1-(realiza_compra.getDescuento()/100));
    }
}
