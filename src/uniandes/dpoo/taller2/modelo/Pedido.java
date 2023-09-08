package uniandes.dpoo.taller2.modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Pedido 
{
	private String nombreCliente;
	private String dirrecionCliente;
	private int numeroPedido;
	private int identificadorPedido;
	private java.util.ArrayList <Producto> itemsPedido;
	
	
	
	
	
	public Pedido (String nombreCliente, String dirrecionCliente, int contador) 
	{
		Random numeroRandom = new Random();
		this.identificadorPedido = numeroRandom.nextInt(999999);
		this.numeroPedido = contador;
		this.itemsPedido = new ArrayList<>();
		this.nombreCliente = nombreCliente;
		this.dirrecionCliente = dirrecionCliente;
		
	}
	
	
	
	public int getIdPedido()
	{
		return identificadorPedido;
	}
	
	
	
	public void agregarProducto (Producto nuevoItem) 
	
	{
		itemsPedido.add(nuevoItem);
	}
	
	
	
	
	
	
	private int getPrecioNetoPedido() 
	{
		return 0;
	}
	
	
	
	private int getPrecioTotalPedido() 
	{
		int precioTotal = this.getPrecioNetoPedido() + this.getPrecioIVAPedido();
		return precioTotal;
	}

	
	private int getPrecioIVAPedido() 
	
	{
		return 0;
	}
	
	
	
	
	private String generarTextoFactura()
	{
		return dirrecionCliente;
	
	}
	
	
	public void guardarFactura (File archivo)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
