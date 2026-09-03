public class EmpleadoContratista extends Empleado{

    private double tarifaPorProyecto;
    private int horas;

    public EmpleadoContratista(String nombre, double sueldo, double tarifaPorProyecto, int horas) {
        super(nombre, sueldo);
        this.tarifaPorProyecto = tarifaPorProyecto;
        this.horas = horas;
    }


    public double getTarifaPorProyecto() {
        return tarifaPorProyecto;
    }

    public void setTarifaPorProyecto(double tarifaPorProyecto) {
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularPago(){
        return (getSueldo()/Empleado.HORAS_MENSUALES)*horas+tarifaPorProyecto;
    }
}
