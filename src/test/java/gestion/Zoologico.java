package gestion;
import java.util.Vector;
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Vector<Zona> zonas = new Vector<>();
	public int totalAnimales;
	public Vector<Animal> animalitos = new Vector<>();
	
	public Zoologico() {
	}
	
	public Zoologico(String nombre, String ubicacion, Vector<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}

	public int cantidadTotalAnimales() {
		for(int i = 0; i < zonas.size(); i++) {
			totalAnimales = totalAnimales + zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Vector<Zona> getZona() {
		return zonas;
	}

	public void setZona(Vector<Zona> zonas) {
		this.zonas = zonas;
	}

}
