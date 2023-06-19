
public class TestReferencia2 {
	public static void main(String[] args) {
		
		Cliente keith = new Cliente();
		keith.nombre = "Keith";
		keith.documento = "80932410";
		keith.telefono = "3245727507";
		
		cuenta cuentaDeKeith = new cuenta ();
		cuentaDeKeith.agencia = 1;
		cuentaDeKeith.titular = keith;
		
		System.out.println(cuentaDeKeith.titular.documento);
		System.out.println(cuentaDeKeith.titular);
		System.out.println(keith);
	}

}
