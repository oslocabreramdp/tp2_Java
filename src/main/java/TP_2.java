import java.util.Scanner;

public class TP_2 {
    public static void main(String[] args){
        int opcion;
        char continuar;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese el numero de ejercicio que quiere resolver");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    int opcion1;
                    double salario;
                    String nombre;

                    input.nextLine();

                    System.out.println("Ingrese el nombre del empleado:");
                    nombre= input.nextLine();
                    input.nextLine();
                    System.out.println("Ingrese el sueldo mensual del empleado");
                    salario=input.nextDouble();

                    System.out.println("1- Calcular un pago de un sueldo a tiempo completo");
                    System.out.println("2- Calcular el pago de un sueldo por horas");
                    System.out.println("3- Calcular el pago del sueldo de un empleado contratista");
                    System.out.println("Ingrese la opcion que desea ejecutar");
                    opcion1 = input.nextInt();
                    switch (opcion1){
                        case 1:

                            Empleado empleadoTC = new EmpleadoTiempoCompleto(nombre,salario);
                            System.out.println("El empleado cobra por mes " +empleadoTC.calcularPago());

                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de horas trabajadas");
                            int horasTrabajadas= input.nextInt();

                            Empleado empPorHoras= new EmpleadoPorHoras(nombre,salario, horasTrabajadas);

                            System.out.println("El salario por mes del empleado es "+empPorHoras.calcularPago());
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de horas trabajadas");
                            int horasTrabajadasContratista= input.nextInt();
                            System.out.println("Ingrese el monto a pagar por proyecto");
                            double salarioPorProyecto= input.nextDouble();

                            Empleado empContratista= new EmpleadoContratista(nombre,salario,salarioPorProyecto,horasTrabajadasContratista);

                            System.out.println("El salario por mes del empleado es "+empContratista.calcularPago());
                            break;
                        default:

                            System.out.println("La opcion ingresada no es valida");

                            break;
                    }
                    break;
                case 2:

                    Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com", 'M' );

                    System.out.println(autor1);

                    Libro libro1 = new Libro("Effective Java",450,150, autor1);

                    System.out.println(libro1);

                    libro1.setPrecio(500);

                    System.out.println(libro1);

                    libro1.setStock(libro1.getStock()+50);

                    System.out.println(libro1);

                    System.out.println(libro1.getAutor());

                    System.out.println(libro1.mostrarInfoConsigna());



                    break;
                case 3:

                    Cliente cliente1= new Cliente("Oslo", "oslo.mdp@gmail.com",20);

                    System.out.println(cliente1.toString());

                    Factura ticket1= new Factura(cliente1,150000);

                    System.out.println(ticket1.toString());

                    System.out.println("El cliente debera pagar: $" +ticket1.montoACobrar() );

                    ticket1.mostrarInfo3();



                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:

                    System.out.println("Opcion Invalida");
                    break;
            }
            input.nextLine();
            String chequear;
            do {

                System.out.println("Desea continuar? (ingresos s o n)");
                chequear = input.nextLine();
            } while (chequear.isEmpty());
            continuar = chequear.charAt(0);

        } while (continuar == 's' || continuar == 'S');


        System.out.println("Hasta la Proxima!");
    }
}