package co.edu.uniquindio.poo;
    import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class Cliente implements Descuento {
    private final String nombre;
    private final String cedula;
    private final String correo;
    public Cliente(String nombre, String cedula, String correo) {
        ASSERTION.assertion(nombre != null );
        ASSERTION.assertion(cedula != null );
        ASSERTION.assertion(correo != null );
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getCorreo() {
        return correo;
    }
    
}
