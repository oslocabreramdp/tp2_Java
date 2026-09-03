public abstract class Empleado {

    protected static final int HORAS_MENSUALES = 192;

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }



    public abstract double calcularPago();



}
