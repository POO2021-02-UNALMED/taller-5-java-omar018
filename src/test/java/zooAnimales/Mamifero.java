package zooAnimales;
import java.util.Vector;
import gestion.Zona;

public class Mamifero extends Animal {
	private static Vector<Mamifero> listado = new Vector<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Vector<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Mamifero(String nombre, int edad, String habitad, String genero,
			boolean pelaje, int patas) {
		super.setTotalAnimales(super.getTotalAnimales()+1);
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitad);
		super.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero() {
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

	public static Vector<Mamifero> getListadoM() {
		return listado;
	}
	

	public void setListado(Vector<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}	
}