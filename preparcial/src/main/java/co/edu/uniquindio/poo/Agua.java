package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;


public class Agua extends Bebidas {

    public Agua (String nombre, double valorBase, double impuestoBase ){
        super (nombre, valorBase, impuestoBase);
        ASSERTION.assertion(impuestoBase==0); 
    }

    @Override
    public double calcularPrecioFinal(){
        double precio= valorBase;
        return precio;
    }

}

