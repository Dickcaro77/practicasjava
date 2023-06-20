
public class PruebaEncapsulamiento { // Prueba de Encerrar.
            
	public static void main(String[] args) { // Creamos metodo main.
		Cuenta cuenta = new Cuenta(0,0); // Creando una nueva cuenta.
		Cliente cliente = new Cliente ();  // Creando un nuevo cliente.
		cliente.setNombre("Keith"); // Colocando a la cuenta cliente1 el nombre de Keith.
		cliente.setDocumento("kd80932410"); // Colocas el documento a la cuenta del cliente Keith.
		
		cuenta.setTitular(cliente); // Colocas el titular.
		
		Cliente titular = cuenta.getTitular();  // Obtienes el titular.
		
		System.out.println("El nombre del cliente es : " + cliente.getNombre()); // Imprimiras el titular de la cuenta
		// del cliente de Keith.
		System.out.println("El nombre de la cuenta del titular es: " + cuenta.getTitular().getNombre());// Obtienes el
		// titular y el
		// nombre de la
		// cuenta.
		System.out.println("El titular de la cuenta cliente es: " + titular); // Imprimes solo el titular.
	}
}
