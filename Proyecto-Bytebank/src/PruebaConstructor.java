
public class PruebaConstructor { // Clase publica constructor.
          public static void main(String[] args) { // LLamas al metodo main para que ejecute este codigo apenas se llegue a
				// compilar.
			Cuenta cuenta1 = new Cuenta(0,555); // Crear una cuenta1 definiendo agencia y numero 555.
			Cuenta cuenta2 = new Cuenta(0,333); // Crear una cuenta2 definiendo agencia y numero 333.
			Cuenta cuenta3 = new Cuenta(0,888); // Crear una cuenta3 definiendo agencia y numero 888.
			
			System.out.println(Cuenta.getTotal()); // Obtengo el total de cuentas.
		}
}
