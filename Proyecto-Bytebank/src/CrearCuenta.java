
public class CrearCuenta {
	
	public static void main(String[] args) {
		//variable           =   valor
		// Esta variable hace referecia -> a este valor con numero de id 123kkd
		cuenta PrimeraCuenta = new Cliente();
		PrimeraCuenta.depositar(1000);
		// PrimeraCuenta.pais = "Israel"; No Compila 
		System.out.println(PrimeraCuenta.getSaldo());
		
		cuenta SegundaCuenta = cuenta();
		SegundaCuenta.depositar(500);
		System.out.println(SegundaCuenta.getSaldo());
		
		System.out.println(PrimeraCuenta);
		System.out.println(SegundaCuenta);
	}

}
