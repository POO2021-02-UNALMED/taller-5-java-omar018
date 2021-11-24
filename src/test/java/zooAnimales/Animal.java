package zooAnimales;
import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona[];
	
	public Animal() {
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		Animal.totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal(String nombre, int edad, String habitad, String genero) {
		Animal.totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;
	}
	
	public static String totalPorTipo() {
		int numeroMamifero = Mamifero.cantidadMamiferos();
		int numeroAve = Ave.cantidadAves();
		int numeroReptil = Reptil.cantidadReptiles();
		int numeroAnfibio = Anfibio.cantidadAnfibios();
		int numeroPez = Pez.cantidadPeces();
		return "Mamiferos: " + numeroMamifero  + 
				"\n" +	"Aves: " + numeroAve  +
				"\n" + "Reptiles: " + numeroReptil  +
				"\n" + "Peces: " + numeroPez  +
				"\n" + "Anfibios: " + numeroAnfibio;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String toString() {
		if (this.zona != null) {
			return "Mi nombre es " + this.nombre +
					", tengo una edad de " + this.edad +
					", habito en " + this.habitat +
					" y mi genero es " + this.genero +
					", la zona en la que me ubico es " + this.zona +
					", en el " + this.zona[0].getZoo();
		}
		else {
			return "Mi nombre es " + this.nombre +
					", tengo una edad de " + this.edad +
					", habito en " + this.habitat +
					" y mi genero es " + this.genero;
		}
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitad) {
		this.habitat = habitad;
	}
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona[] getZona() {
		return zona;
	}

	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
}
