import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        // Adicionando vértices
        for (String vertice : new String[]{"Mercearia", "B", "C", "D", "E", "F", "G", "H"}) {
            grafo.adicionarVertice(vertice);
        }
        
        // Adicionando arestas conforme a tabela de distâncias
        grafo.adicionarAresta("Mercearia", "B", 11);
        grafo.adicionarAresta("Mercearia", "C", 5);
        grafo.adicionarAresta("Mercearia", "D", 8);
        grafo.adicionarAresta("Mercearia", "F", 8);
        grafo.adicionarAresta("Mercearia", "H", 7);
        grafo.adicionarAresta("B", "C", 3);
        grafo.adicionarAresta("B", "E", 8);
        grafo.adicionarAresta("C", "F", 10);
        grafo.adicionarAresta("D", "E", 4);
        grafo.adicionarAresta("D", "H", 12);
        grafo.adicionarAresta("E", "F", 5);
        grafo.adicionarAresta("G", "H", 7);
        grafo.adicionarAresta("F", "G", 3);
        grafo.adicionarAresta("H", "F", 2);
        
        // Executando Dijkstra a partir do vértice "Mercearia"
        Map<String, Integer> distancias = grafo.dijkstra("Mercearia");
        
        // Imprimindo distâncias
        for (Map.Entry<String, Integer> entrada : distancias.entrySet()) {
            System.out.println("Distância da Mercearia para " + entrada.getKey() + " é " + entrada.getValue());
        }
    }
}
