package examen.recuperacion.pazminio;

public class SocioVip extends Socio{
	protected String codigoVip;
	protected String fechaCumpleaņos;
	
	public String getCodigoVip() {
		return codigoVip;
	}
	public void setCodigoVip(String codigoVip) {
		this.codigoVip = codigoVip;
	}
	public String getFechaCumpleaņos() {
		return fechaCumpleaņos;
	}
	public void setFechaCumpleaņos(String fechaCumpleaņos) {
		this.fechaCumpleaņos = fechaCumpleaņos;
	}
	@Override
	public String toString() {
		return "SocioVip [codigoVip=" + codigoVip + ", fechaCumpleaņos=" + fechaCumpleaņos + "]";
	}
	
	

}
