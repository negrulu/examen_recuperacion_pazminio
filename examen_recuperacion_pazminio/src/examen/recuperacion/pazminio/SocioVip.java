package examen.recuperacion.pazminio;

public class SocioVip extends Socio{
	protected String codigoVip;
	protected String fechaCumpleaños;
	
	public String getCodigoVip() {
		return codigoVip;
	}
	public void setCodigoVip(String codigoVip) {
		this.codigoVip = codigoVip;
	}
	public String getFechaCumpleaños() {
		return fechaCumpleaños;
	}
	public void setFechaCumpleaños(String fechaCumpleaños) {
		this.fechaCumpleaños = fechaCumpleaños;
	}
	@Override
	public String toString() {
		return "SocioVip [codigoVip=" + codigoVip + ", fechaCumpleaños=" + fechaCumpleaños + "]";
	}
	
	

}
