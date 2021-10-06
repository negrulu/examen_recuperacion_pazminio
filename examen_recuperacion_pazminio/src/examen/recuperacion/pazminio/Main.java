package examen.recuperacion.pazminio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaOpcion = new Scanner(System.in);
		Scanner entradaUsuario = new Scanner(System.in);
		Scanner entradaContraseña = new Scanner(System.in);
		Scanner entradaCaracter = new Scanner(System.in);
		String usuario;
		String contraseña;
		int opcion;
		String usuarioCorrecto = "ADMIN";
		String contraseñaCorrecta = "ABC345";
		Socio socios[] = new Socio[0];
		SocioEsporadico socioEsporadico1 = new SocioEsporadico();
		SocioGeneral socioGeneral1 = new SocioGeneral();
		SocioVip socioVip1 = new SocioVip();
		
		do {
	    System.out.println("Inicio sesion");
	    System.out.println("Nombre de usuario: ");
	    usuario = entradaUsuario.next();

	    System.out.println("Clave: ");
	    contraseña = entradaContraseña.next();
	    if(usuario!=usuarioCorrecto || contraseña!=contraseñaCorrecta) {
	    	System.out.println("Usuario o contraseña incorrecta");
	    	System.out.println("Intente de nuevo");
	    }
		}while (usuario==usuarioCorrecto && contraseña==contraseñaCorrecta);
		
		do {
			System.out.println("Sistema club Castillos del Valle");
			System.out.println("1. Ingresar socio");
			System.out.println("2. Búsqueda general");
			System.out.println("3. Búsqueda por tipo de socio");
			System.out.println("4. SALIR");
			opcion = entradaOpcion.nextInt();
			
			switch (opcion) {
			case 1:
				Socio ingresoSocios = new Socio();
				Socio arrayTemporal[] = new Socio[socios.length + 1];
				for (int i = 0; i < socios.length; i++) {
					arrayTemporal[i] = socios[i];
				}
				System.out.println("Ingrese el codigo de membresia: ");
				String codigoMembresia = entradaCaracter.nextLine();
				ingresoSocios.setCodigoMembresia(codigoMembresia);
				System.out.println("Ingrese el nombre: ");
				String nombre = entradaCaracter.nextLine();
				ingresoSocios.setNombre(nombre);
				System.out.println("Ingrese el apellido: ");
				String apellido = entradaCaracter.nextLine();
				ingresoSocios.setApellido(apellido);
				
				System.out.println("Ingrese que tipo de socio es: ");
				System.out.println("a. Socio General");
				System.out.println("b. Socio Esporadico");
				System.out.println("c. Socio Vip");
				char opcionSocio = entradaCaracter.next().charAt(0);
				
				switch (opcionSocio) {
				//general
				case 'a':
					System.out.println("Ingrese el codigo general: ");
					String codigoGeneral = entradaCaracter.nextLine();
					socioGeneral1.setCodigoGeneral(codigoGeneral);
					System.out.println("Ingrese la profesion: ");
					String profesion = entradaCaracter.nextLine();
					socioGeneral1.setProfesion(profesion);
				break;
				//esporadico
				case 'b':
					System.out.println("Ingrese el codigo esporadico: ");
					String codigoEsporadico = entradaCaracter.nextLine();
					socioEsporadico1.setCodigoEsporadico(codigoEsporadico);
					System.out.println("Ingrese su actividad preferida: ");
					String actividadPreferida = entradaCaracter.nextLine();
					socioEsporadico1.setActividadPreferida(actividadPreferida);
				break;
				//vip
				case 'c':
					System.out.println("Ingrese ");
				break;
				}
				
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
			}
			
			
		}while (opcion!=4);
		
	}

}
