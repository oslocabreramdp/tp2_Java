public class Circulo {

    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        this.radio = 1;
        this.color = "Rojo";
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }


}
