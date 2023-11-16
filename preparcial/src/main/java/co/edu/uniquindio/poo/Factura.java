package co.edu.uniquindio.poo;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.util.Collection;
import java.util.LinkedList;

public class Factura {
    private Cliente cliente;
    private Collection<Producto> productos;


    public Factura (Cliente cliente){
        ASSERTION.assertion(cliente!=null);
        this.cliente=cliente;
        this.productos=new LinkedList<>();
    }


	public Cliente getCliente() {
		return cliente;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}
    public void registrarProductos(Producto producto){
        productos.add(producto);
    }

    public double calcularPrecioFinal(){
        double precioTotal = productos.stream().mapToDouble(Producto::calcularPrecioFinal).sum();
        double descuento = cliente.calcularDescuento();
        return precioTotal - (precioTotal * descuento);
    }
}

