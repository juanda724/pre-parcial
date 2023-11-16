package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class BebidasNacional extends Bebidas{
    private final double gradoAlcohol;
    
    public BebidasNacional (String nombre, double valorBase, double impuestoBase, double gradoAlcohol) {
        super(nombre, valorBase, impuestoBase);
        this.gradoAlcohol=gradoAlcohol;
        ASSERTION.assertion(gradoAlcohol>0); 

    }

    @Override
    public double calcularPrecioFinal(){
        double precioTotal= (impuestoBase*valorBase);
        if (gradoAlcohol>=1) {
            double impuesto = impuestoBase*gradoAlcohol;
            assert impuesto <= 0.5;
            precioTotal=(impuesto)*valorBase;
        }
        return precioTotal;

         
    }
}