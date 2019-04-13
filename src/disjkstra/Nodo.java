package disjkstra;
 
import java.util.ArrayList;
import java.util.Collection;
 
/**
 *
 * @author Mario Ríos
 */
public class Nodo implements Comparable<Nodo>{
     
    public final String nombre;
    public final Collection<Camino> vecinos = new ArrayList<>();
    public int distancia = Integer.MAX_VALUE;
    public Nodo anterior;
     
    public Nodo(String nombre) 
    { 
        this.nombre = nombre; 
    }
     
    public void agregarVecino(Nodo n, int distancia)
    {
        vecinos.add(new Camino(n, distancia));
    }
     
    public String toString() { return nombre; }
     
    public int compareTo(Nodo otro)
    {
        if(distancia == otro.distancia)
            return nombre.compareTo(otro.nombre);
        return Double.compare(distancia, otro.distancia);
    }  
     
    public void imprimirRuta()
    {
        //TODO
    }
}