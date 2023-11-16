/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class FacturaTest {
    private static final Logger LOG = Logger.getLogger(FacturaTest.class.getName());


    
    @Test
    public void totalPagar() {
        LOG.info("Inicio de prueba datos completos...");
        var estudiante1= new Estudiante("Juan", "1091884759", " juan@gmail.com", 2);   
        var factura = new Factura(estudiante1);
        var producto1 = new Dulces("Chocolate",100, 0.1, 50);
        factura.registrarProductos(producto1);
        factura.calcularPrecioFinal();
        assertEquals(88.0, factura.calcularPrecioFinal());
        LOG.info("Fin de prueba datos completos...");        
    }
}
