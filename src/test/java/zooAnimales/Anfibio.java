package zooAnimales;
import java.util.Vector;
import gestion.Zona;

public class Anfibio extends Animal {
	
	private static Vector<Anfibio> listado = new Vector<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Vector<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Anfibio(String nombre, int edad, String habitad, String genero,
			String colorPiel, boolean venenoso) {
		super.setTotalAnimales(super.getTotalAnimales()+1);
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitad);
		super.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public static Vector<Anfibio> getListadoAnf() {
		return listado;
	}

	public void setListado(Vector<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}