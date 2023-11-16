package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Profesor extends Cliente{
    private final CargoProfesor cargoProfesor;

    public Profesor(String nombre, String cedula, String correo, CargoProfesor cargoProfesor) {
        super(nombre, cedula, correo);
        ASSERTION.assertion(cargoProfesor != null);
        this.cargoProfesor = cargoProfesor;
    }   


    public CargoProfesor getCargoProfesor(){
        return cargoProfesor;
    }

    @Override
    public double calcularDescuento(){
        double calcularDescuento = 0.0;
        if (getCargoProfesor().equals(CargoProfesor.AUXILIAR)){
            calcularDescuento=0.3;
        }
        else{ if(getCargoProfesor().equals(CargoProfesor.ASISTENTE)){
            calcularDescuento=0.5;
        }
             else{
                if (getCargoProfesor().equals(CargoProfesor.ASOCIADO)){
                    calcularDescuento=0.1;
                }
                 else{
                    if (getCargoProfesor().equals(CargoProfesor.TITULAR)) {
                    calcularDescuento=0.16;
            }}
            }}
        return calcularDescuento;
    }
}
