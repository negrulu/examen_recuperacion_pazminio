package examen.recuperacion.pazminio;

public class SocioEsporadico extends Socio{
	protected String codigoEsporadico;
	protected String actividadPreferida;
	
	public String getCodigoEsporadico() {
		return codigoEsporadico;
	}
	public void setCodigoEsporadico(String codigoEsporadico) {
		this.codigoEsporadico = codigoEsporadico;
	}
	public String getActividadPreferida() {
		return actividadPreferida;
	}
	public void setActividadPreferida(String actividadPreferida) {
		this.actividadPreferida = actividadPreferida;
	}
	
	@Override
	public String toString() {
		return "SocioEsporadico [codigoEsporadico=" + codigoEsporadico + ", actividadPreferida=" + actividadPreferida
				+ "]";
	}
	

}
