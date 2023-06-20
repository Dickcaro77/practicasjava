
public class Cliente { // Crea la clase Cliente.
	
	private String nombre; // Define un valor string nombre privado.
	private String documento;// Define un valor string documento privado.
	private String telefono;// Define un valor string Telefono privado.
	public String getNombre() { // Define un valor string con metodo para obtener el nombre privado.
		return nombre;// Retorna el nombre.
	}
	public void setNombre(String nombre) { // Crea un metodo para establecer el nombre.
		this.nombre = nombre; // Define el nombre.
	}
	public String getDocumento() {  // Crea un metodo para obtener el documento.
		return documento;// Retorna el valor del documento.
	}
	public void setDocumento(String documento) { // Crea un metodo para establecer el documento.
		this.documento = documento; // Define el documento.
	}
	public String getTelefono() { // Crea un metodo para obtener el telefono.
		return telefono;  // Retorna el valor de telefono.
	}
	public void setTelefono(String telefono) { // Crea un metodo para establecer el telefono.
		this.telefono = telefono; // Define el valor de telefono.
	}


}
