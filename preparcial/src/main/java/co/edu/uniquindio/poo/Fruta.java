package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Fruta extends Producto{
    private int cantidadKilos;

    public Fruta(String nombre, double valorBase, double impuestoBase, int cantidadKilos) {
        super(nombre, valorBase, impuestoBase);
        ASSERTION.assertion(cantidadKilos>=0);
        this.cantidadKilos = cantidadKilos;
        this.impuestoBase=0.07;
    }

   
    public int getCantidadKilos(){
        return cantidadKilos;
    }

    public double getImpuestoBase(){
        return impuestoBase;
    }

    @Override
    public double calcularPrecioFinal(){
        double precio= (valorBase*impuestoBase);
        if(cantidadKilos >= 10){
            precio=valorBase;}
            else{
                if(cantidadKilos > 3){
                    precio =  ((impuestoBase-((cantidadKilos-3)/100.0))*precio);
                }
            }
        return precio;
        }
}
    

