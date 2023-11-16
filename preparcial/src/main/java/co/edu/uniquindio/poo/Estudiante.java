package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Estudiante extends Cliente {
    private int semestre;

    public Estudiante(String nombre, String cedula, String correo, int semestre) {
        super(nombre, cedula, correo);
        ASSERTION.assertion(semestre>=0 && semestre<=10);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }
    
    @Override
    public double calcularDescuento(){
        double descuento=semestre*(12.0/100.0);
        return descuento;
    }
}
