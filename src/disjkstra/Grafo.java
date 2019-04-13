package disjkstra;
 
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
 
/**
 *
 * @author Mario Ríos
 */
public class Grafo {
     
    private final Map<String, Nodo> nodos; 
     
    public Grafo(Collection<Nodo> c)
    {
        nodos = new HashMap<>();
        c.stream().forEach((nodo) -> {
            nodos.put(nodo.nombre, nodo);
        });
    }
     
    public void dijkstra(String nombre) {
      if (!nodos.containsKey(nombre)) {
         System.err.printf("El grafo no continiene el nodo: " + nombre + "\n");
         return;
      }
  
      // Asigna valores iniciales necesarios para el Algoritmo
 
      //Segunda Parte del Algoritmo de Dijsktra (calcular distancias);
   }
}
