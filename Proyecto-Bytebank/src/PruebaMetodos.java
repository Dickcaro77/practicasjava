
public class PruebaMetodos { // Definiendo la clase pruebasMetodos.
	public static void main(String[] args) { // Aca creas un main.
		Cuenta micuenta = new Cuenta(0,0); // Creas una nueva cuenta
		micuenta.depositar(500);
		System.out.println(micuenta.getSaldo());
		
		micuenta.retirar(100);
		System.out.println(micuenta.getSaldo());
		
		Cuenta cuentaDeMai = new Cuenta(0,0);
		cuentaDeMai.depositar(1000);
		boolean puedetransferir = cuentaDeMai.tranferir(400, micuenta);
		
		if(puedetransferir) {
		     System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No es posible");
		}
		
		
		System.out.println(cuentaDeMai.getSaldo());
		System.out.println(micuenta.getSaldo());
	}
}
