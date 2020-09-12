package librerianotificaciones.release;

import java.util.ArrayList;

// Este seria nuestra clase Cliente del problema
public class Main {

	public static void main(String[] args) {
		
		// Aqui iria el frontend donde el usuario ingresa las notificaciones
		// que desea enviar
		String tiposDeNotificacionesSeparadasPorComas = "correo,sms";
		
		// Ahora creo los tipos de notificaciones que quiere enviar
		NotificadorFactory notificadorFactory = new NotificadorFactory();
		ArrayList<IServicioDeNotificacion> serviciosDeNotificacionFactory = notificadorFactory.crearNotificaciones(tiposDeNotificacionesSeparadasPorComas);
     
  
    	// Ahora envio las notificaciones que selecciono el usuario
    	NotificadorCliente notificacionesDelCliente = new NotificadorCliente();
    	
    	for (IServicioDeNotificacion servicio : serviciosDeNotificacionFactory) {
    		notificacionesDelCliente.notificar(servicio);
		}
    	
	}

}
