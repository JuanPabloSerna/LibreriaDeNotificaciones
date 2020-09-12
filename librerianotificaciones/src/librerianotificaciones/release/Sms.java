package librerianotificaciones.release;

public class Sms implements IServicioDeNotificacion {

	
	private int numero;
	private String texto;
	
	
    public boolean validarSms(String mensaje) {
        return mensaje.contains("XXX");
    }

    
	@Override
	public void enviar() {
		System.out.println("Notificación: sms " + numero + texto);
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
