import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;
import java.time.LocalDateTime;

public class Factura {

    private static final int LARGO=13;

    private String idFactura;
    private Cliente cliente;
    private LocalDateTime fecha;
    private double  montoCompra;

    public Factura(Cliente cliente, double montoCompra) {
        if (cliente == null) {
            throw new IllegalArgumentException("Una factura no puede crearse sin un cliente asociado.");
        }
        this.idFactura=UUID.randomUUID().toString().substring(0,LARGO);
        this.fecha= LocalDateTime.now();
        this.cliente = cliente;
        this.montoCompra = montoCompra;
    }

    public Factura() {
        this.idFactura=UUID.randomUUID().toString().substring(0,LARGO);
        this.fecha= LocalDateTime.now();
    }

    public String getIdFactura() {
        return idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", montoCompra=" + montoCompra +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Factura factura)) return false;
        return Objects.equals(idFactura, factura.idFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFactura);
    }

    public double montoACobrar(){
        return montoCompra*(1-(cliente.getDescuento()/100));
    }

    public void mostrarInfo3(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy --- HH:mm:ss");
        System.out.println("Factura[id= "+idFactura+
                ", fecha= " + fecha.format(formato)+
                ", monto= " +montoCompra+
                ", montoConDesc= "+montoACobrar()+
                ", Cliente[id= "+cliente.getIdCliente()+
                ", nombre= "+cliente.getNombre()+
                ", email= "+cliente.getEmail()+
                ", descuento= "+cliente.getDescuento()+"]]");
    }
}
