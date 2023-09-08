package uniandes.dpoo.taller2.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CalculadoraRestaurante 
{
	//private ArrayList<Combo> comboLista;
	private ArrayList <Ingrediente> ingredienteLista;
	 private Pedido pedidoActivo;
	// private ProductoAjustado productoActivo;
	private ArrayList <Producto> productoLista;
	private int contarPedido;
	
	
	public CalculadoraRestaurante() 
	{
		
		this.contarPedido = 0;
	}
	
	
	
	
	
	
	public void iniciarPedido (String nombreCliente, String dirrecionCliente)
	{
		contarPedido = contarPedido + 1;
		Pedido pedidoActivo = new Pedido(nombreCliente, dirrecionCliente, contarPedido);
		establecerPedidoActivo(pedidoActivo);
	}
	
	
	
	private void establecerPedidoActivo(Pedido pedidoActivo) 
	{
		this.pedidoActivo = pedidoActivo;
		
	}


	
	

	public void cerrarYGuardarPedido()
	{
		
	}
	
	
	
	public void cargarInformacionRestaurante (String archivoIngredientes, String archivoMenu, String archivoCombos) throws IOException  
	{
		archivoIngredientes = "data/ingredientes.txt";
		archivoMenu = "data/menu.txt";
		archivoCombos = "data/combos.txt";
		
		cargarIngredientes(archivoIngredientes);
		cargarMenu(archivoMenu);
		cargarCombos(archivoCombos);
		
	}
	
	
	
	
	private void cargarIngredientes (String archivoIngredientes) throws FileNotFoundException, IOException
	{
		
		Map<String, Ingrediente> ingredientes = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
		String linea = br.readLine(); 

		linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(";");
			String nombreIngrediente = partes[0];
			int precio = Integer.parseInt(partes[1]);
			
			
			Ingrediente elIngrediente = ingredientes.get(nombreIngrediente);
			if (elIngrediente == null)
			{
				elIngrediente = new Ingrediente(nombreIngrediente, precio);
				ingredientes.put(nombreIngrediente, elIngrediente);
			}
			
			linea = br.readLine();
		}
		br.close();

		System.out.println(ingredientes); 
	}
	
	
	
	
	private void cargarMenu (String archivoMenu) throws FileNotFoundException, IOException
	{
		Map<String, ProductoMenu> menu = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
		String linea = br.readLine(); 

		linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(";");
			String nombreProducto = partes[0];
			int precio = Integer.parseInt(partes[1]);
			
			
			ProductoMenu elMenu = menu.get(nombreProducto);
			if (elMenu == null)
			{
				elMenu = new ProductoMenu (nombreProducto, precio);
				menu.put(nombreProducto, elMenu);
			}
			
			linea = br.readLine();
		}
		br.close();

		System.out.println(menu); 
	}
	
	
	
	
	private void cargarCombos (String archivoCombos) throws FileNotFoundException, IOException
	{
		Map<String, Combo> combos = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
		String linea = br.readLine(); 

		linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(";");
			String nombreCombo = partes[0];
			int descuento = Integer.parseInt(partes[1]);
			
			
			Combo elCombo = combos.get(nombreCombo);
			if (elCombo == null)
			{
				elCombo = new Combo (nombreCombo, descuento);
				combos.put(nombreCombo, elCombo);
			}
			
			linea = br.readLine();
		}
		br.close();

		System.out.println(combos);  
	}
	
	
	
	
	
	
	public Pedido getPedidoEnCurso()
	{
		return pedidoActivo;
	}
	
	
	public ArrayList <Producto> getMenuBase()
	{
		return productoLista;
	}
	
	public ArrayList <Ingrediente> getIngredientes()
	{
		 return ingredienteLista;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
