package examen.recuperacion.pazminio;

public class SocioVip extends Socio{
	protected String codigoVip;
	protected String fechaCumplea�os;
	
	public String getCodigoVip() {
		return codigoVip;
	}
	public void setCodigoVip(String codigoVip) {
		this.codigoVip = codigoVip;
	}
	public String getFechaCumplea�os() {
		return fechaCumplea�os;
	}
	public void setFechaCumplea�os(String fechaCumplea�os) {
		this.fechaCumplea�os = fechaCumplea�os;
	}
	@Override
	public String toString() {
		return "SocioVip [codigoVip=" + codigoVip + ", fechaCumplea�os=" + fechaCumplea�os + "]";
	}
	
	

}
