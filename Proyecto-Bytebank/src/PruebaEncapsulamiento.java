
public class PruebaEncapsulamiento {
            
	public static void main(String[] args) {
		cuenta cuenta = new cuenta ();
		Cliente cliente = new Cliente ();
		cliente.setNombre("Keith"); 
		cliente.setDocumento("kd80932410");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(titular);
	}
}
