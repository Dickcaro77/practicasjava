
public class TestReferencia {
	
	public static void main(String[] args) { //Definiendo un main.
		Cuenta PrimeraCuenta = new Cuenta(0,0); //Creando una nueva cuenta.
		PrimeraCuenta.depositar(200);
		
		Cuenta SegundaCuenta = PrimeraCuenta;
		SegundaCuenta.depositar(100);
		
		System.out.println("Saldo PrimeraCuenta: " 
		+ PrimeraCuenta.getSaldo());
		
		System.out.println("Saldo SegundaCuenta: " 
				+ SegundaCuenta.getSaldo());
		
		SegundaCuenta.depositar(400);
		System.out.println("Saldo PrimeraCuenta: " 
				+ PrimeraCuenta.getSaldo());
		
		System.out.println(PrimeraCuenta);
		System.out.println(SegundaCuenta);
		
		if (PrimeraCuenta == SegundaCuenta ) {
			System.out.println("imprime el mismo objeto");
		}
	}

}
