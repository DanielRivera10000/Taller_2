package uniandes.dpoo.taller2.modelo;

public class Combo extends Producto

{
	
	private double descuento;
	private String nombreCombo;
	
	
	
	public Combo (String nombre, double descuento)
	{
		this.nombreCombo = nombre;
		this.descuento = descuento;
	}
	
	
	public void agregarItemACombo (Producto ItemCombo)
	{
		
	}
	
	
	
	public String getNombre()
	{
		return nombreCombo;
		
	}
	
	
	
	public int getPrecio()
	{
		return (int) descuento;
		
	}
	
	
	public String generarTextoFactura()
	{
		return null;
		
	}
}
