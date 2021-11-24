package zooAnimales;
import java.util.Vector;
import gestion.Zona;

public class Ave extends Animal {
	private static Vector<Ave> listado = new Vector<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
					Vector<Ave> listado, int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Ave(String nombre, int edad, String habitad, String genero, String colorPlumas) {
		super.setTotalAnimales(super.getTotalAnimales()+1);
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitad);
		super.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
		
	public static Vector<Ave> getListadoA() {
		return listado;
	}

	public void setListado(Vector<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}