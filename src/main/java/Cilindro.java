import javax.swing.*;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro() {
        this.altura = 1;
    }


    public double calcularVolumen(){
        return  super.calcularArea()*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public double calcularArea(){
        return ((2*super.calcularArea())+(2*getRadio()*Math.PI*altura));
    }

    public double calcularAreaBase(){
        return super.calcularArea();
    }

}
