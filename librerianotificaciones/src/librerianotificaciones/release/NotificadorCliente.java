package librerianotificaciones.release;

public class NotificadorCliente {

	Notificador notificador;
	
	public void notificar(IServicioDeNotificacion notificacion) {
		notificador = new Notificador(notificacion);
		notificador.enviarNotificacion(notificacion);
	}
}
