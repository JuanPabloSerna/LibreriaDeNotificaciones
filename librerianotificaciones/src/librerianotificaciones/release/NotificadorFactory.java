package librerianotificaciones.release;

import java.util.ArrayList;

public class NotificadorFactory {

	
	@SuppressWarnings("null")
	public ArrayList<IServicioDeNotificacion> crearNotificaciones(String tiposDeNotificacionesSeparadasPorComas) {
		
		String[] tiposDeNotificacionesElegidas = tiposDeNotificacionesSeparadasPorComas.split(",");
		
		// ArrayList de servicios de notificación
		ArrayList<IServicioDeNotificacion> serviciosDeNotificacion = new ArrayList<IServicioDeNotificacion>();

		if(tiposDeNotificacionesElegidas[0].equalsIgnoreCase("correo")) {
			// Servicio de correo
			Correo correo = new Correo();
	    	correo.setCorreo("juan@gmail.com");
	    	correo.setCuerpoDelCorreo("Hola");
	    	correo.setTituloDelCorreo("Hola mundo");
	    	serviciosDeNotificacion.add(correo);
		}
		if(tiposDeNotificacionesElegidas[1].equalsIgnoreCase("sms")) { 
	    	// Servicio de sms
	    	Sms sms = new Sms();
	    	sms.setNumero(123);
	    	sms.setTexto("Hola mundo");
	    	serviciosDeNotificacion.add(sms);
		}

    	return serviciosDeNotificacion;
	}
}
