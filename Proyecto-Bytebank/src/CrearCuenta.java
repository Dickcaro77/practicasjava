
public class CrearCuenta { // Establece la clase base de CrearCuenta igual al nombre del archivo.
	
	public static void main(String[] args) { // Crea un metodo main para ejecutar el codigo de CrearCuenta a el ser
		// solicitado.
		//variable           =   valor
		// Esta variable hace referecia -> a este valor con numero de id 123kkd
	    Cuenta PrimeraCuenta = new Cuenta(0,0); // Crea la primera cuenta en el cual solicita un nuevo cliente y este se ejecuta.
		PrimeraCuenta.depositar(1000);
		// PrimeraCuenta.pais = "Israel"; No Compila 
		System.out.println(PrimeraCuenta.getSaldo()); //muestra el resultado al que se le llama.
		
		Cuenta SegundaCuenta = new Cuenta(0,0);
		SegundaCuenta.depositar(500);
		System.out.println(SegundaCuenta.getSaldo());
		
		System.out.println(PrimeraCuenta);
		System.out.println(SegundaCuenta);
	}

}
