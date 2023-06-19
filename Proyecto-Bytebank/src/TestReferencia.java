
public class TestReferencia {
	
	public static void main(String[] args) {
		cuenta PrimeraCuenta = new cuenta();
		PrimeraCuenta.saldo = 200;
		
		cuenta SegundaCuenta = PrimeraCuenta;
		SegundaCuenta.saldo = 100;
		
		System.out.println("Saldo PrimeraCuenta: " 
		+ PrimeraCuenta.getSaldo());
		
		System.out.println("Saldo SegundaCuenta: " 
				+ SegundaCuenta.getSaldo());
		
		SegundaCuenta.saldo += 400;
		System.out.println("Saldo PrimeraCuenta: " 
				+ PrimeraCuenta.getSaldo());
		
		System.out.println(PrimeraCuenta);
		System.out.println(SegundaCuenta);
		
		if (PrimeraCuenta == SegundaCuenta ) {
			System.out.println("imprime el mismo objeto");
		}
	}

}
