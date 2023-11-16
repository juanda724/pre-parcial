package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
public class Dulces extends Producto {
    private final double cantidadAzucar;

    public Dulces (String nombre, double valorBase, double impuestoBase, double cantidadAzucar) {
        super(nombre, valorBase, impuestoBase);
        this.cantidadAzucar=cantidadAzucar;
        ASSERTION.assertion(cantidadAzucar>=0); 
        this.impuestoBase=10.0;
    }

    @Override
    public double calcularPrecioFinal(){
        double precioTotal= ((impuestoBase/100)*valorBase);
        if (cantidadAzucar>50) {
            precioTotal=valorBase*0.2;
        }
        return precioTotal;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }



}