# practica-log4j2
Practica simple con apache.log4j para captaciones de logs.

## Metodos Log4j
### DEBUG
Usado para escribir mensajes de depuracion
### INFO
Mensajes de estilo verbose. Puramente informativos de determinada accion
### WARN
Para alertar de eventos de los que se quiere dejar constancia pero, que no afectan al funcionamiento de la aplicacion
### ERROR
Usado para los mensajes de eventos que afectan el programa pero lo dejan seguir funcionando. Algun parametro no es correcto pero se carga el parametro por defecto.
### FATAL
Usado para errores criticos. Normalmente despues de guardar el mensaje el programa terminara

## Appenders Usuales
### FileAppender / RollingAppender:
Salida redirigida a un fichero de texto. log
### SocketAppender
Hacia un servidor remoto par almacenar los registros
### SMTPAppender
A un correo electronico
### JDBCAppender
Hacia un base de datos
### ConsoleAppender
Salida por consola. En un entorno de produccion no se suele usar de esta forma por perder gran parte de su utilidad pero mientras se desarrolla es una forma util de ver logs.


