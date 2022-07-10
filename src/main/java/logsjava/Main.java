package logsjava;

import org.apache.log4j.Logger;


public class Main {

    private static Logger logJava = Logger.getLogger(Main.class);
    public static void main(String[] args) {


        logJava.debug("LOG DEBUG");
        logJava.info("LOG INFO");
        logJava.warn("LOG WARN");
        logJava.error("LOG ERROR");
        logJava.fatal("LOG FATAL");



        /*
        * DEBUG : Usado para escribir mensajes de depuracion
        * INFO : Mensajes de estilo verbose. Puramente informativos de determinada accion
        * WARN : Para alertar de eventos de los que se quiere dejar constancia pero,
        *  que no afectan al funcionamiento de la aplicacion
        * ERROR : Usado para los mensajes de eventos que afectan el programa pero lo dejan seguir funcionando.
        * Algun parametro no es correcto pero se carga el parametro por defecto.
        * FATAL : Usado para errores criticos. Normalmente despues de guardar el mensaje el programa terminara*/
    }
}
