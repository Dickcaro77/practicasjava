
public class PruebaAcceso {
	
	public static void main(String[] args) {
		cuenta cuenta = cuenta();
		cuenta.agencia(-22);
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}

}
