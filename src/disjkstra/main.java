
package disjkstra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
public class main {
    private final static String ruta = "C:\\Users\\Mario\\Downloads\\got.txt";
    public static void main(String[] args)
    {
        // Crear Nodos
        //Nodo A = new Nodo("A");
        Map<String,Nodo> nodos = cargarDatos(ruta);
        int x = 0;
        //..
 
        //Asignar Caminos a Nodos...
 
        // Ejecutar Dijkstra
         
        //Imprimir ruta mas corta
 
        //Fin =)
     
    }
     
    public static Map<String, Nodo> cargarDatos(String ruta)
    {
        String cadena;
        String cadenaCompleta = "";
        try {
            FileReader f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                cadenaCompleta += cadena;
            }
            b.close();
        }catch(Exception e) {
            System.out.println("Error al leer el archivo");
        }
         
        String[] split = cadenaCompleta.split("[|]");
         
        Map<String, Nodo> mapa = new HashMap<>();
                Nodo n1, n2;
        for(String s : split) {
            String[] r = s.split(","); 
                        if(mapa.get(r[0]) == null)
                            mapa.put(r[0], new Nodo(r[0]));
                        if(mapa.get(r[1]) == null)
                            mapa.put(r[1], new Nodo(r[1]));
                        n1 = mapa.get(r[0]);
                        n2 = mapa.get(r[1]);
                        n1.agregarVecino(n2, Integer.parseInt(r[2]));
        }   
                return mapa;
    }
}
