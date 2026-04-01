public class LAB8 {
    static void vertexCover(int[][] graph, int V) {
        boolean[] visited = new boolean[V];
        for (int u = 0; u < V; u++) {
            if (!visited[u]) {
                for (int v = 0; v < V; v++) {
                    if (graph[u][v] == 1 && !visited[v]) {
                        visited[u] = true;
                        visited[v] = true;
                        break;
                    }
                }
            }
        }
        System.out.println("Approximate Vertex Cover:");
        for (int i = 0; i < V; i++) {
            if (visited[i])
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 1 },
                { 0, 0, 1, 1, 0 }
        };
        vertexCover(graph, V);
    }
}
