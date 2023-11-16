package co.edu.uniquindio.poo.AssertionUtil;

import java.util.function.Supplier;

public enum Assert {
    ASSERTION;

    public void assertion(boolean condicion,Supplier<RuntimeException> exception){
        if( !condicion ){
            throw exception.get();
        }
    }

    public void assertion(boolean condicion,String mensaje){
        assertion(condicion, ()->new RuntimeException(mensaje));
    }

    public void assertion(boolean condicion){
        assertion(condicion, "ERROR: Condición no cumplida");
    }
}
