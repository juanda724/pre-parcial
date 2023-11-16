package co.edu.uniquindio.poo;

public class Panaderia extends Producto {
    private final boolean conservantes;

    public Panaderia(String nombre, double valorBase, double impuestoBase, boolean conservantes) {
        super(nombre, valorBase, impuestoBase);
        this.conservantes = conservantes;
    }
    @Override
    public double calcularPrecioFinal() {
        double precioFinal = valorBase;
        if (conservantes) {
            precioFinal = precioFinal * 0.18;
        }
        return precioFinal;
    }
}
