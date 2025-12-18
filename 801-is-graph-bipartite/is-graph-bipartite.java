class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        Arrays.fill(colour, -1);

        for (int node = 0; node < n; node++) {
            if (colour[node] == -1) {
                if (!dfs(graph, 0, colour, node))
                    return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int c, int[] colour, int node) {
        colour[node] = c;

        for (int nbr : graph[node]) {
            if (colour[nbr] == -1) {
                if (!dfs(graph, c ^ 1, colour, nbr))
                    return false;
            } else if (colour[nbr] == c) {
                return false;
            }
        }
        return true;
    }
}