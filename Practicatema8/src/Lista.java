import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista extends Persona {
	 
	
	
	static ArrayList<Persona> lista=new ArrayList<Persona>();
	
	 

	 public Lista(ArrayList<Persona> list, String nombre, String apellidos, String DNI, int edad, String call, int cp, String prov) {
		 super( nombre, apellidos, DNI, edad,  call, cp, prov);
		 lista=list;
		 
	 }
	 public static void cargar() {
		 
		 	Persona p1=new Persona(" Adrian ", " Garcia Santos ", " 11111111A ", 23, " C/ Los Olivos 3 ", 38493,
					" Santa Cruz de Tenerife ");	
		 	
			Persona p2 = (new Persona(" Ana ", "Mendez Nuñez", " 22222222B ", 22, " C/ Los Pinos 25 ", 38403,
					" Santa Cruz de Tenerife "));			
			Persona p3 = (new Persona(" Maria ", "Sanchez Camacho", " 33333333C ", 45, " C/ Los Franceses 23 ", 38505,
					"Las Palmas"));			
			Persona p4=(new Persona(" Julio ", " Brito Gonzalez ", " 44444444D ", 30, " C/ Los Pinos 25 ", 38403, " Las Palmas "));
					
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
			lista.add(p4);
			
			
			System.out.println("Los datos han sido cargados");
			
		}
	 
	 
	 public static void listar() {		 
		 
		 for (Persona p:lista) {
			 
			 System.out.println(p.getNombre()+p.getApellidos()+p.getDni()+p.getEdad()+p.getCalle()+p.getCp()+p.getProvincia());
		}
		 
	 }
	public static void add(Persona persona) {
		lista.add(new Persona(nombre,apellidos,dni,edad,calle,cp,provincia));
		
	}
	public static void eliminar(int n) {
		lista.remove(n - 1);

	}
	public static int contar() {
		return lista.size();
	}
	
	public static ArrayList<Persona> buscaPerfil(String dni , String cognome) {
	    ArrayList<Persona> resultado = null;
	    for (Persona p : lista) {
	        if (p.isVisible() 
	            && p.getDni().equals(cognome)
	            && p.getApellidos().equals(cognome)) {
	            resultado = lista;
	            break;
	        }
	    }
	    return resultado;
			
	}
		
	
	public void ordenar() {
		
	}
	
	
	 
}

/*  cargar(): cargar los datos de la tabla anterior en la lista.
 listar(): lista todos las personas de la lista.
 insertar(): insertar una persona de final de la lista.
 eliminar(): eliminar una persona de la lista.
 contar(): muestra el número de personas de la lista.
Nota: Cada opción del menú debe llamar a un método de la clase Lista que implemente dicha funcionalidad.
Opcional: Añadir las siguientes opciones al menú:
 buscar(): busca una Persona por el DNI, si la encuentra, muestra los datos de la persona, en caso
contrario mostrar un mensaje que diga que esa persona no se encuentra en la lista.
 ordenar(): ordenar los elementos de la lista por apellidos.
Nombre Apellidos DNI Edad Calle Número CP Provincia
*/