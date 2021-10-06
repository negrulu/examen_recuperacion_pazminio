package examen.recuperacion.pazminio;

public class SocioGeneral extends Socio{
	protected String codigoGeneral;
	protected String profesion;
	public String getCodigoGeneral() {
		return codigoGeneral;
	}
	public void setCodigoGeneral(String codigoGeneral) {
		this.codigoGeneral = codigoGeneral;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	@Override
	public String toString() {
		return "SocioGeneral [codigoGeneral=" + codigoGeneral + ", profesion=" + profesion + "]";
	}
	

}
