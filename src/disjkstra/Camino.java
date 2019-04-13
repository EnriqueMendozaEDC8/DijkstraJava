package disjkstra;
 
/**
 *
 * @author Mario Ríos
 */
public class Camino {
     
    public final Nodo nodoDestino;
    public final double peso;
    public Camino(Nodo nodoDestino, double peso)
    { 
        this.nodoDestino = nodoDestino; 
        this.peso = peso; 
    }
}