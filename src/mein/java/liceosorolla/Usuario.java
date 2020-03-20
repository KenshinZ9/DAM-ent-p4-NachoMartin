package mein.java.liceosorolla;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String fecha;
	private int id;
	
	
	
	public Usuario(String nombre, String apellidos, String fecha, int id) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.id = id;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setIdr(int id) {
		this.id = id;
	}
	
	public String mayus() {
		String mayus="";
		mayus=this.nombre.toUpperCase()+" "+this.apellidos.toUpperCase(); 
		return mayus;
	}
	
	public String minus() {
		String minus="";
		minus=this.nombre.toLowerCase()+" "+this.apellidos.toLowerCase(); 
		return minus;
	}
}
