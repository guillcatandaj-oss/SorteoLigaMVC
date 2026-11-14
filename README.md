# SorteoLigaMVC
Aplicación Java MVC para el sorteo recursivo de equipos en una liga profesional, con excepciones personalizadas y serialización de datos.
## Desarrollo del Proyecto

El proyecto fue desarrollado utilizando el lenguaje Java en el entorno Eclipse IDE, siguiendo el patrón arquitectónico Modelo\-Vista\-Controlador (MVC) para separar la lógica de negocio, la presentación y el control de la aplicación.

Durante el desarrollo se implementaron las siguientes funcionalidades:

- Creación de las clases del modelo para representar equipos, partidos y el torneo.
- Implementación de un algoritmo recursivo encargado de realizar el sorteo de los enfrentamientos entre equipos.
- Desarrollo de excepciones personalizadas para controlar errores relacionados con la cantidad de equipos y los procesos de sorteo.
- Implementación de serialización y deserialización mediante archivos .ser para permitir la persistencia de los datos del torneo.
- Desarrollo de una vista en consola para mostrar los emparejamientos generados.
- Implementación de un controlador encargado de coordinar la comunicación entre la vista y el modelo.

Además, se utilizó Git y GitHub para el control de versiones del proyecto, realizando múltiples commits durante el proceso de desarrollo con el objetivo de documentar la evolución de la aplicación y mantener un historial organizado de cambios.

## Justificación de las Clases del Proyecto

### Equipo.java

Se creó para representar a cada uno de los equipos participantes del torneo. Esta clase almacena la información básica de cada equipo y permite gestionar sus datos dentro del sistema.

### Partido.java

Se creó para representar un enfrentamiento entre dos equipos. Su función principal es almacenar la información de los equipos que participan en cada partido generado durante el sorteo.

### Torneo.java

Se creó como la clase principal del modelo. En ella se encuentra la lógica de negocio del sistema, incluyendo el registro de equipos, la validación de reglas del torneo, el algoritmo recursivo de emparejamiento y los métodos de serialización y deserialización para guardar y recuperar la información.

### TorneoControlador.java

Se creó para implementar el patrón MVC, actuando como intermediario entre la Vista y el Modelo. Su función es coordinar las acciones del usuario y comunicar los resultados obtenidos por el modelo a la interfaz.

### ConsolaVista.java

Se creó para gestionar la presentación de la información al usuario. Esta clase muestra los resultados del sorteo y los mensajes generados por la aplicación a través de la consola.

### NumeroEquiposInvalidoException.java

Se creó para controlar situaciones en las que la cantidad de equipos no es válida para un torneo de eliminación directa. Permite generar mensajes de error claros y específicos para el usuario.

### SorteoInvalidoException.java

Se creó para gestionar errores relacionados con el proceso de emparejamiento de equipos. Garantiza que las reglas del sorteo se cumplan correctamente y facilita la detección de problemas lógicos.

### Main.java

Se creó como punto de entrada de la aplicación. Su función es inicializar los equipos participantes, crear las instancias necesarias del sistema y ejecutar el proceso completo de sorteo.

