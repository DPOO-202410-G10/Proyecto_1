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
import usuarios.Propietario;

public class Galeria {
	//Atributos
	String nombre;
	Administrador administrador;
	Inventario inventario;
	Map<String, Cliente> clientes;
	Map<String, Pago> pagos;
	Map<String, Subasta> subastas;
	Map<String, Cajero> cajeros;
	Map<String, Operador> operadores;
	Map<String, Propietario> propietarios;
	
	
	
	//Constructor
	public Galeria(String nombre) {
		this.nombre = nombre;
	}
	
	
	
//< Carga de Datos >=============================================================================================x>
	public void cargarDatos() throws IOException {
		this.administrador = cargarAdmin(File.separator + "Entrega_2" + File.separator + "data" + File.separator + "administrador.csv");
		this.clientes = cargarClientes();
		cargarEmpleados();
		this.inventario = new Inventario();
		this.propietarios = cargarPropietarios();
		this.pagos = cargarPagos();
	}
//<x=============================================================================================================x>
	
	
	
//< Getters >====================================================================================================x>
	public Administrador getAdmin(String idAdmin) {
		return this.administrador;
	}
	
	public Cliente getCliente(String idCliente) {
		return this.clientes.get(idCliente);
	}
	
	public Inventario getInventario() {
		return this.inventario;
	}
	
	public Cajero getCajero(String idCajero) {
		return this.cajeros.get(idCajero);
	}
	
	public Operador getOperador(String idOperador) {
		return this.operadores.get(idOperador);
	}
	
	public Propietario getPropietario(String idPropietario) {
		return this.propietarios.get(idPropietario);
	}
	
	public Pago getPago(String idPago) {
		return this.pagos.get(idPago);
	}
//<x=============================================================================================================x>
	
	
	
//< Carga de Datos Individuales >================================================================================x>
	private Administrador cargarAdmin(String rutaArchivo) throws IOException {
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		Administrador admin = new Administrador(linea[0], linea[1], linea[2]);
		br.close();
		return admin;
	}
	
	//<x========================================================================================================x>
	
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
	
	//<x========================================================================================================x>
	
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
	
	//<x========================================================================================================x>
	
	private Map<String, Propietario> cargarPropietarios(String rutaArchivo) throws IOException{
		Map<String, Propietario> propietarios = new HashMap<String, Propietario>();
		
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		
		while(linea != null) {
			Map<String, Map<String, Pieza>> piezasHistorial = new HashMap<String, Map<String, Pieza>>();
			Map<String, Pieza> antiguas = new HashMap<String, Pieza>();
			Map<String, Pieza> actuales = new HashMap<String, Pieza>();
			
			for (String idPieza: linea[6].split(",")) {
				antiguas.put(idPieza, inventario.getPieza(idPieza));
			}
			for (String idPieza: linea[7].split(",")) {
				actuales.put(idPieza, inventario.getPieza(idPieza));
			}
			
			piezasHistorial.put("Antiguas" , antiguas);
			piezasHistorial.put("Actuales", actuales);
			
			Propietario propietario = new Propietario(linea[0], linea[1], linea[2],
										Boolean.valueOf(linea[3]), linea[4], linea[5], piezasHistorial);
			propietarios.put(linea[0], propietario);
			linea = br.readLine().split(";");
		}
		br.close();
		
		return propietarios;
	}
	
	//<x========================================================================================================x>
	
	private Map<String, Pago> cargarPagos(String rutaArchivo) throws IOException{
		Map<String, Pago> pagos = new HashMap<String, Pago>();
		
		FileReader file = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(file);
		String[] linea = br.readLine().split(";");
		linea = br.readLine().split(";");
		
		while(linea != null) {
			Pago pago = new Pago(linea[0], this.clientes.get(linea[1]), this.inventario.getPieza(linea[2]),
							linea[3], Integer.parseInt(linea[4]), Double.parseDouble(linea[5]));
			pagos.put(linea[0], pago);
			linea = br.readLine().split(";");
		}
		br.close();
		
		return pagos;
	}
//<x=============================================================================================================x>
	
}
