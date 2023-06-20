
public class PruebaAcceso { // Probar acceso a Cuenta.java
	
	public static void main(String[] args) { // Creamos el metodo main para poder ejecutar el codigo apenas ejecutemos.
		Cuenta cuenta = new Cuenta(0,0); // Llamamos a la clase Cuenta y le denominamos cuenta1 en el cual se crea una
		// nueva cuenta con valor 0,0. El error era que si o si debes crear
		// primero una nueva cuenta para poder testear el codigo no solo colocar
		// Cuenta() porque Cuenta tiene un constructor que necesita agencia y numero
		// de forma obligatoria y en este caso le puse 0,0.
		cuenta.setAgencia(-22); // Le colocamos valores extra a Agencia mediante el metodo setAgencia hallado en
		// Cuenta.java
		cuenta.depositar(400); // Depositamos 400 a la Cuenta creada mediante el metodo depositar que se
		// encuentra en Cuenta.Java
		cuenta.retirar(300); // Retiramos 300 de la Cuenta creada mediante el metodo retirar que se encuentra
		// en Cuenta.java
		System.out.println(cuenta.getSaldo()); // Obtenemos el saldo mediante una impresion y tambien la agencia.
		System.out.println(cuenta.getAgencia());
	}

}
