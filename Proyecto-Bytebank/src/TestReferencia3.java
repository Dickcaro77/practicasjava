
public class TestReferencia3 { // Creando una nueva clase

	public static void main(String[] args) {// un main
		Cuenta cuentaDeKeith = new Cuenta(0, 0); // Una nueva cuenta
		// Cliente keith = new Cliente ();
		// keith.setNombre("keith");
		// keith.setDocumento("80932410");//Estas cuatro lineas de codigo son hechas en caso de crear un cliente llamado "keith"
		// cuentaDeKeith.setTitular(keith);
		System.out.println(cuentaDeKeith.getTitular().getNombre());// Especifica un termino llamado "NULL" que indica que
																	// la cuenta no tiene //ningun valor
	}
}
