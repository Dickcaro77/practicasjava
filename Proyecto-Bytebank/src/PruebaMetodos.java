
public class PruebaMetodos {
	public static void main(String[] args) {
		cuenta micuenta = new cuenta();
		micuenta.saldo = 300;
		micuenta.depositar(200);
		System.out.println(micuenta.saldo);
		
		micuenta.retirar(100);
		System.out.println(micuenta.getSaldo());
		
		cuenta cuentaDeMai = new cuenta();
		cuentaDeMai.depositar(1000);
		boolean puedetransferir = cuentaDeMai.tranferir(400, micuenta);
		
		if(puedetransferir) {
		     System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No es posible");
		}
		
		
		System.out.println(cuentaDeMai.saldo);
		System.out.println(micuenta.saldo);
	}
}
