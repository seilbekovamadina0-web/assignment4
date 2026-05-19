import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices;

    public Vertex(T data) {
        this.data = data;
        adjacentVertices = new HashMap<>();
    }

    public boolean contains(T item) {
        return adjacentVertices.containsKey(new Vertex<>(item));
    }

    public List<T> adjacencyList() {
        List<T> list = new LinkedList<>();

        for (Vertex<T> item : adjacentVertices.keySet()) {
            list.add(item.data);
        }

        return list;
    }

    public void addAdjacentVertex(Vertex<T> dest, double weight) {
        adjacentVertices.put(dest, weight);
    }

    // getters&setters constructors
    // equals
}
