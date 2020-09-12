package librerianotificaciones.release;

public class Correo implements IServicioDeNotificacion {

	
	private String correo;
	private String tituloDelCorreo;
	private String cuerpoDelCorreo;
	
	
    public boolean validarCorreo(String correo) {
        return correo.contains("@");
    }

    
	@Override
	public void enviar() {
		System.out.println("Notificacion: " + correo + tituloDelCorreo + cuerpoDelCorreo);
	}
	
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTituloDelCorreo() {
		return tituloDelCorreo;
	}

	public void setTituloDelCorreo(String tituloDelCorreo) {
		this.tituloDelCorreo = tituloDelCorreo;
	}

	public String getCuerpoDelCorreo() {
		return cuerpoDelCorreo;
	}

	public void setCuerpoDelCorreo(String cuerpoDelCorreo) {
		this.cuerpoDelCorreo = cuerpoDelCorreo;
	}
	
}
