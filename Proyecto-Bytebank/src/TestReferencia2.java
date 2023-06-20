
public class TestReferencia2 { //Creacion de una nueva clase.
	public static void main(String[] args) { //Generamos un main. 
		
		Cliente keith = new Cliente(); //Un nuevo cliente llamado "keith".
		keith.setNombre ("Keith");//Declaramos su nombre.
		keith.setDocumento("80932410");//Declaramos su documento.
		keith.setTelefono("3245727507");//Declaramos su numero de telefono.
		
		Cuenta cuentaDeKeith = new Cuenta (0,0);
		cuentaDeKeith.setAgencia(1);
		cuentaDeKeith.setTitular(keith);
		
		System.out.println(cuentaDeKeith.getTitular().getDocumento());
		System.out.println(cuentaDeKeith.getTitular());
		System.out.println(keith.getNombre());
	}

}
