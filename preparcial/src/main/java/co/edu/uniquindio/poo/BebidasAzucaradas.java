package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;


public class BebidasAzucaradas extends Bebidas{
    private final double cantidadAzucar;
    
    public BebidasAzucaradas (String nombre, double valorBase, double impuestoBase, double cantidadAzucar) {
        super(nombre, valorBase, impuestoBase);
        this.cantidadAzucar=cantidadAzucar;
        ASSERTION.assertion(cantidadAzucar>=0); 

    }

    @Override
    public double calcularPrecioFinal(){
        double precioTotal= (impuestoBase*valorBase);
        if (cantidadAzucar>35) {
            precioTotal=valorBase*0.25;
        }
        return precioTotal;

        
    }
}