import java.util.*;

public class Grafo {
    private Map<String, List<Aresta>> vertices = new HashMap<>();
    
    public void adicionarVertice(String rotulo) {
        vertices.putIfAbsent(rotulo, new ArrayList<>());
    }
    
    public void adicionarAresta(String de, String para, int peso) {
        vertices.get(de).add(new Aresta(para, peso));
        vertices.get(para).add(new Aresta(de, peso)); 
    }
    
    public Map<String, Integer> dijkstra(String inicio) {
        Map<String, Integer> distancias = new HashMap<>();
        for (String vertice : vertices.keySet()) {
            distancias.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);
        
        PriorityQueue<Aresta> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.peso));
        pq.add(new Aresta(inicio, 0));
        
        while (!pq.isEmpty()) {
            Aresta atual = pq.poll();
            for (Aresta aresta : vertices.get(atual.vertice)) {
                int novaDistancia = distancias.get(atual.vertice) + aresta.peso;
                if (novaDistancia < distancias.get(aresta.vertice)) {
                    distancias.put(aresta.vertice, novaDistancia);
                    pq.add(new Aresta(aresta.vertice, novaDistancia));
                }
            }
        }
        
        return distancias;
    }
}
