package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;


public class BebidasAlcoholicasImportadas extends Bebidas{
    private final double cantidadAlcohol;
    
    public BebidasAlcoholicasImportadas (String nombre, double valorBase, double impuestoBase, double cantidadAlcohol) {
        super(nombre, valorBase, impuestoBase);
        this.cantidadAlcohol=cantidadAlcohol;
        ASSERTION.assertion(cantidadAlcohol>=0); 

    }

    @Override
    public double calcularPrecioFinal(){
         double precioTotal= (valorBase * 1.3) * (1 + (0.3 * cantidadAlcohol));
         return precioTotal;
    }
}