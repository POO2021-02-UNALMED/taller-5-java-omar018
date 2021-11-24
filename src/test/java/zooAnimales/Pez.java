package zooAnimales;
import java.util.Vector;
import gestion.Zona;

public class Pez extends Animal {
	private static Vector<Pez> listado = new Vector<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Vector<Pez> listado, int salmones, int bacalaos, String colorEscamas, int colorAletas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Pez(String nombre, int edad, String habitad, String genero,
		String colorEscamas, int cantidadAletas) {
		super.setTotalAnimales(super.getTotalAnimales()+1);
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitad);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez() {
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public static Vector<Pez> getListadoPez() {
		return listado;
	}

	public void setListado(Vector<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int colorAletas) {
		this.cantidadAletas = colorAletas;
	}
}