// entidad cuenta :
class Cuenta { // Define la clase principal base llamada Clase valga la redundancia.
	private double saldo;// Define una variable saldo que puede contener decimales(double) y es privada
	// que solo aplica a la clase en si misma.
	private int agencia; // Define una variable de agencia que es entero(int) y es privada tambien.
	private int numero; // Define una variable de numero que es entero(int) y es privada tambien.
	private Cliente titular = new Cliente();// Define un metodo privado en el cual llama al modulo Cliente.java y crea
	// el metodo Cliente para asi llamarlo.
	// En un lugar de la memoria va a ser creada esa variable total
	private static int total = 0;// Define el valor estatico que no puede ser cambiado de la variable total como
	// 0.

	public Cuenta(int agencia, int numero) {  // Crea el constructor de la clase.
		// if (agencia <= 0) {
		// System.out.println("No se permite 0");
		// this.agencia = 1;
		// }else {
		Cuenta.total++; // Contador respecto a el total de cuentas.
		System.out.println("total De Cuentas es" + Cuenta.total); // Imprime el total de cuentas.
		this.agencia = agencia; // Define la variable agencia previamente establecida.
		this.numero = numero; // Define la variable numero previamente establecida.
		this.saldo = 100; // Define la variable saldo previamente establecida.; 
		System.out.println("Se van creando:" + total + "cuentas");  // Imrprime el total de cuentas creadas.
	}

	// Hay metodos que no retornan valor
	public void depositar(double valor) { // Crea un metodo llamado depositar que tiene de argumento una variable double
		// llamada valor.
		// Esta cuenta Esta cuenta
		// This account This account
		// This object
		this.saldo = this.saldo + valor; // En el cual se añade el saldo y se suma el valor agregado.
	}

	// Metodos que retornan valor
	public boolean retirar(double valor) { // Crea un metodo boolean el cual se reconoce como retirar y recibe la misma
		// variable que depositar double llamada valor.
		if (this.saldo >= valor) { // Hace una consulta si el saldo es menor a valor solicitado.
			this.saldo = this.saldo - valor; // Esta consula es comprobada mediante la resta y si la respuesta es
			// negativa devolvera verdadero.
			return true;
		} else {  // En caso contrario devolvera falso.
			return false;  
		}
	}

	public boolean tranferir(double valor, Cuenta cuenta) { // Crea un metodo llamado transferir el cual recibe tanto la
		// variable valor y cuenta.
		if (this.saldo >= valor) { // Si el saldo es mayor a valor se deposita si ningun inconveniente.
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else { // Si el saldo es menor a valor se niega la transferencia.
			return false;
		}
	}

	public double getSaldo() { // Se obtiene el saldo.
		return this.saldo;
	}

	public int getNumero() { // Obtiene el numero de la cuenta.
		return this.numero;
	}

	public void setNumero(int numero) { // Estable el numero.
		if (numero <= 0) {
			System.out.println("No puede ser el valor menor o igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() { // Obtiene la agencia a utilizar.
		return agencia;
	}

	public void setAgencia(int agencia) { // Estable la agencia mediante un valor entero en el cual si esta es menor a 0
		// retornara una impresion y en caso contrario no definira la agencia.
		if (agencia <= 0) {
			System.out.println("No puede ser el valor menor o igual a" + "etc");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() { // Obtiene el nombre del titular del Cliente.
		return titular;
	}

	public void setTitular(Cliente titular) { // Estable el nombre al titular Cliente.
		this.titular = titular; // Define el titular a el Cliente.
	}

	public static int getTotal() { // Obtiene el total del Cliente.
		return Cuenta.total;
	}
}
