package examen.recuperacion.pazminio;

public class Socio {
	protected String codigoMembresia;
	protected String nombre;
	protected String apellido;
	public String getCodigoMembresia() {
		return codigoMembresia;
	}
	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Socio [codigoMembresia=" + codigoMembresia + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
