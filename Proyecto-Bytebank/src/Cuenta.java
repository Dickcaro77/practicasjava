// entidad cuenta :
class cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	// En un lugar de la memoria va a ser creada esa variable total
	private static int total = 0;

	public cuenta(int agencia, int numero) {
		// if (agencia <= 0) {
		// System.out.println("No se permite 0");
		// this.agencia = 1;
		// }else {
		cuenta.total++;
		System.out.println("total De Cuentas es" + cuenta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Se van creando:" + total + "cuentas");
	}

	// Hay metodos que no retornan valor
	public void depositar(double valor) {
		// Esta cuenta Esta cuenta
		// This account This account
		// This object
		this.saldo = this.saldo + valor;
	}

	// Metodos que retornan valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranferir(double valor, cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("No puede ser el valor menor o igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("No puede ser el valor menor o igual a" + "etc");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return cuenta.total;
	}
}
