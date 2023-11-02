package domain;

public class Electrodomestico {

    // Atributos de la clase
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor vacio.
    public Electrodomestico() {}; // Constructor 1

    public  Electrodomestico(int precio, String color, char consumoEnergetico, double peso) { // Constructor 2.
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // Getters and Setters
    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    // toString().
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Electrodomestico{");
        sb.append(" precio = ").append(precio);
        sb.append(", color = '").append(color).append('\'');
        sb.append(", consumoEnergetico = ").append(consumoEnergetico);
        sb.append(", peso = ").append(peso);
        sb.append(", ").append(super.toString()); // Muestra el espacio en memoria que esta utilizando.
        sb.append('}');
        return sb.toString();
    }


}
