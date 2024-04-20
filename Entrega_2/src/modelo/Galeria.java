package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import usuarios.Administrador;
import usuarios.Cajero;
import usuarios.Cliente;
import usuarios.Operador;

public class Galeria {
	String nombre;
	Administrador administrador;
	Inventario inventario;
	Map<String, Cliente> clientes;
	Map<String, Pago> pagos;
	Map<String, Subasta> subastas;
	Map<String, Cajero> cajeros;
	Map<String, Operador> operadores;
	
	public Galeria(String nombre) {
		this.nombre = nombre;
	}
	
	public void cargarDatos() throws IOException {
		this.inventario = new Inventario();
		this.administrador = cargarAdmin(File.separator + "Entrega_2" + File.separator + "data" + File.separator + "administrador.csv");
	}
	
	private Administrador cargarAdmin(String rutaArchivo) throws IOException {
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		Administrador admin = new Administrador(linea[0], linea[1], linea[2]);
		br.close();
		return admin;
	}
	
	private Map<String, Cliente> cargarClientes(String rutaArchivo) throws IOException {
		Map<String, Cliente> clientes = new HashMap<String, Cliente>();
		
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		
		while(linea != null) {
			Cliente cliente = new Cliente(linea[0], linea[1], linea[2], 
										  Boolean.parseBoolean(linea[3])), linea[4], linea[5], 
										  Integer.parseInt(linea[6]));
			clientes.put(linea[0], cliente);
			linea = br.readLine().split(";");
		}
		br.close();
		return clientes;
	}
	
	private void cargarEmpleados(String rutaArchivo) throws IOException {
		Map<String, Cajero> cajeros = new HashMap<String, Cajero>();
		Map<String, Operador> operadores = new HashMap<String, Operador>();
		
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		
		while(linea != null) {
			if(linea[3].equals("Cajero")) {
				Cajero empleado = new Cajero(linea[0], linea[1], linea[2]);
				cajeros.put(linea[0], empleado);
			} else if(linea[3].equals("Operador")) {
				Operador empleado = new Cajero(linea[0], linea[1], linea[2]);
				operadores.put(linea[0], empleado);
			}
			linea = br.readLine().split(";");
		}
		
		br.close();
		this.cajeros = cajeros;
		this.operadores = operadores;
	}
	
}
