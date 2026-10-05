class Solution {
    public boolean canFinish(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i < V;i++) {
            adj.add(new ArrayList<>());
        }
        int [] indegree = new int[V];
        for(int [] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i < V;i++){
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            count++;
            for(int neigh: adj.get(node)) {
                indegree[neigh]--;
                if(indegree[neigh] == 0) {
                    q.add(neigh);
                }
            }
        }
        return count == V;
    }
}
