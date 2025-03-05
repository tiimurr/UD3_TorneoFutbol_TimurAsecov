
package torneofutbol;

public class Equipo {
    
    private String[] nombresJugadores;
    private int[] dorsalesJugadores;
    private int cantidadJugadores;
    private String nombreEquipo;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        nombresJugadores = new String[100];
        dorsalesJugadores = new int[100];
        cantidadJugadores = 0;
    }

    // Método para agregar un jugador al equipo
    public void agregarJugador(String nombre, int dorsal) {
        nombresJugadores[cantidadJugadores] = nombre;
        dorsalesJugadores[cantidadJugadores] = dorsal;
        cantidadJugadores++;
    }
    
     // Método para mostrar la lista de jugadores del equipo
    public void mostrarJugadores() {
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Nombre: " + nombresJugadores[i] + ", con dorsal: " + dorsalesJugadores[i]);
        }
    }

    // Método para obtener el número de jugadores del equipo
    public int obtenerNumeroDeJugadores() {
        return cantidadJugadores;
    }
    
    //Método para obtener el nombre del equipo
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
}
