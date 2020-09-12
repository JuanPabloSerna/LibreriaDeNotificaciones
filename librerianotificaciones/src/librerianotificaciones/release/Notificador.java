package librerianotificaciones.release;


public class Notificador {
	
	
	@SuppressWarnings("unused")
	private IServicioDeNotificacion notificacion;
	
	
	public Notificador(IServicioDeNotificacion notificacion) {
		this.notificacion = notificacion;
	}
	
	public void enviarNotificacion(IServicioDeNotificacion notificacion) {
		notificacion.enviar();
	}
}
