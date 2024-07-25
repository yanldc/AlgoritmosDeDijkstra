import java.util.Map;

public class Dijkstra {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        // Adicionando vértices
        for (String vertice : new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "P"}) {
            grafo.adicionarVertice(vertice);
        }
        
        // Adicionando arestas
        grafo.adicionarAresta("A", "B", 140);
        grafo.adicionarAresta("A", "C", 85);
        grafo.adicionarAresta("B", "J", 26);
        grafo.adicionarAresta("B", "H", 70);
        grafo.adicionarAresta("C", "D", 19);
        grafo.adicionarAresta("C", "F", 128);
        grafo.adicionarAresta("D", "E", 30);
        grafo.adicionarAresta("E", "G", 30);
        grafo.adicionarAresta("F", "L", 65);
        grafo.adicionarAresta("F", "H", 128);
        grafo.adicionarAresta("G", "I", 74);
        grafo.adicionarAresta("H", "L", 70);
        grafo.adicionarAresta("H", "J", 61);
        grafo.adicionarAresta("I", "G", 74);
        grafo.adicionarAresta("J", "N", 61);
        grafo.adicionarAresta("L", "M", 30);
        grafo.adicionarAresta("L", "P", 110);
        grafo.adicionarAresta("N", "P", 70);
        
        // Executando Dijkstra a partir do vértice A
        Map<String, Integer> distancias = grafo.dijkstra("A");
        
        // Imprimindo distâncias
        for (Map.Entry<String, Integer> entrada : distancias.entrySet()) {
            System.out.println("Distância de A para " + entrada.getKey() + " é " + entrada.getValue());
        }
    }
}
