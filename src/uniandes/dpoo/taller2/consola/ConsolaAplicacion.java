package uniandes.dpoo.taller2.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import uniandes.dpoo.taller2.modelo.CalculadoraRestaurante;



public class ConsolaAplicacion 


{
	private CalculadoraRestaurante restaunrante = new CalculadoraRestaurante();
	
	
	
	
	public void ejecutarAplicacion()
	{
		System.out.println("Bienvenido al Programa Restaurante \n");

		boolean pedido = false;
		
		boolean continuar = true;
		
		while (continuar)
		{
			try
			{
				
				System.out.println("\nOpciones de la aplicación\n");
				System.out.println("1. Mostrar el menu");
				System.out.println("2. Iniciar un nuevo pedido");
				System.out.println("3. Agregar un elemento al pedido");
				System.out.println("4. Cerrar el pedido y guardar la factura");
				System.out.println("5. Salir de la aplicacion");
				
				
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
				{
					mostrarMenu();
				}
				
				else if (opcion_seleccionada == 2)
					
				{
				String nombreCliente = input("Ingrese el nombre del cliente\n");
				String direccionCliente = input("Ingrese su direccion\n");
				restaunrante.iniciarPedido(nombreCliente, direccionCliente);
				}
				
				
				
				else if (opcion_seleccionada == 5)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}

				
				else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
			
		
	
		
	
		
		
	public void mostrarMenu()
	{
		
		System.out.println("\nINGREDIENTES: \n");
		
		System.out.println("          1.I - lechuga: 1000");
		System.out.println("          2.I - tomate: 1000");
		System.out.println("          3.I - cebolla: 1000");
		System.out.println("          4.I - queso mozzarella: 2500");
		System.out.println("          5.I - huevo: 2500");
		System.out.println("          6.I - queso americano: 2500");
		System.out.println("          7.I - tocineta express: 2500");
		System.out.println("          8.I - papa callejera: 2000");
		System.out.println("          9.I - pepinillos: 2500");
		System.out.println("          10.I - cebolla grille: 2500");
		System.out.println("          11.I - suero costeño: 3000");
		System.out.println("          12.I - frijol refrito: 4500");
		System.out.println("          13.I - queso fundido: 4500");
		System.out.println("          14.I - tocineta picada: 6000");
		System.out.println("          15.I -  piña: 2500");
		
		
		System.out.println("\nMENU: \n");
		
		System.out.println("          1.M - corral: 14000");
		System.out.println("          2.M - corral queso: 16000");
		System.out.println("          3.M - corral pollo: 15000");
		System.out.println("          4.M - corralita: 13000");
		System.out.println("          5.M - todoterreno: 25000");
		System.out.println("          6.M - 1/2 libra: 25000");
		System.out.println("          7.M - especial: 24000");
		System.out.println("          8.M - casera: 23000");
		System.out.println("          9.M - mexicana: 22000");
		System.out.println("          10.M - criolla: 22000");
		System.out.println("          11.M - costeña: 20000");
		System.out.println("          12.M - hawaiana: 20000");
		System.out.println("          13.M - wrap de pollo: 15000");
		System.out.println("          14.M - wrap de lomo: 22000");
		System.out.println("          15.M - ensalada mexicana: 20900");
		System.out.println("          16.M - papas medianas: 5500");
		System.out.println("          17.M - papas grandes: 6900");
		System.out.println("          18.M - papas en casco medianas: 5500");
		System.out.println("          19.M - papas en casco grandes: 6900");
		System.out.println("          20.M - agua cristal sin gas: 5000");
		System.out.println("          21.M - agua cristal con gas: 5000");
		System.out.println("          22.M - gaseosa: 5000");
		
		
		System.out.println("\nCOMBOS: \n");
		
		System.out.println("          1.C - combo corral ---> corral, papas medianas, gaseosa ---> Precio (22050");
		System.out.println("          2.C - combo corral queso ---> corral queso, papas medianas, gaseosa ---> Precio (23850");
		System.out.println("          3.C - combo todoterreno ---> todoterreno, papas grandes, gaseosa ---> Precio (34317");
		System.out.println("          4.C - combo especial ---> especial, papas medianas, gaseosa ---> Precio (34500");
		
	}
	



	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		ConsolaAplicacion consola = new ConsolaAplicacion();
		consola.ejecutarAplicacion();
	}
	
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
}
