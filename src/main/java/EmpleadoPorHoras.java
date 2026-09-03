public class EmpleadoPorHoras extends Empleado{

    private int horas;

    public EmpleadoPorHoras(String nombre, double sueldo, int horas) {
        super(nombre, sueldo);
        this.horas = horas;
    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularPago(){
        return (getSueldo()/Empleado.HORAS_MENSUALES)*horas;
    }

}
