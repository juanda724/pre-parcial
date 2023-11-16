package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class Producto implements PrecioFinal {
    protected String nombre;
    protected double valorBase;
    protected double impuestoBase;

    public Producto (String nombre, double valorBase, double impuestoBase) {
        ASSERTION.assertion(nombre != null);
        ASSERTION.assertion (valorBase>0);
        this.nombre=nombre;
        this.valorBase=valorBase;
        this.impuestoBase=impuestoBase;
    }

    public  String getNombre(){
        return nombre;
    }
    public  double getValorBase(){
        return valorBase;
    }
    public  double getImpuestoBase(){
        return impuestoBase;
    }

    public Producto(String nombre, double valorBase) {
        ASSERTION.assertion(nombre != null && nombre.isBlank());
        ASSERTION.assertion (valorBase>0);            
        this.nombre = nombre;
        this.valorBase = valorBase;
    }
}