public class EmpleadoTiempoCompleto extends Empleado{


    public EmpleadoTiempoCompleto(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double calcularPago(){
        return getSueldo();
    }
}
