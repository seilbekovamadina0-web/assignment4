import java.util.*;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices;

    public Vertex(T data) {
        this.data = data;
        adjacentVertices = new HashMap<>();
    }

    public void addAdjacentVertex(Vertex<T> dest, double weight) {
        adjacentVertices.put(dest, weight);
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj== null || getClass() != obj.getClass()) return false;

        Vertex<?> vertex = (Vertex<?>) obj;

        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    // getters&setters constructors
    // equals
}
