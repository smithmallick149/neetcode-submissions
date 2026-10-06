class Solution {
    private List<Integer> topoSort(int V, List<List<Integer>> adj) {
        int [] indegree = new int[V];
        for(int i=0;i < V;i++) {
            for(int next: adj.get(i)) {
                indegree[next]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i < V;i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            for(int next: adj.get(node)) {
                indegree[next]--;
                if(indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
        return topo;
    }

    private boolean hasCycle(List<Integer> topo, int total) {
        return topo.size() != total;
    }

    public String foreignDictionary(String[] words) {
       int N = words.length;
       List<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i < 26;i++) {
        adj.add(new ArrayList<>());
       }
       boolean [] exists = new boolean[26];

       for(String word: words) {
            for(char c: word.toCharArray()) {
                exists[c - 'a'] = true;
            }
       }
    //    build graph
    for(int i=0;i< N-1;i++) {
        String s1 = words[i];
        String s2 = words[i+1];
        int len = Math.min(s1.length(), s2.length());
// impossible case
        if(s1.length() > s2.length() && s1.substring(0, len).equals(s2.substring(0, len))) {
            return "";
        }
        for(int j=0;j < len;j++) {
            if(s1.charAt(j) != s2.charAt(j)) {
                int u = s1.charAt(j) - 'a';
                int v = s2.charAt(j) - 'a';
                adj.get(u).add(v);
                break;
            }
        }
    }
    int totalChars = 0;
    for(boolean present: exists) {
        if(present) totalChars++;
    }
    // topo sort
    List<Integer> topo = topoSort(26, adj);
    List<Integer> actualTopo = new ArrayList<>();
    for(int node:topo) {
        if(exists[node]) actualTopo.add(node);
    }

    if(hasCycle(actualTopo, totalChars)) return "";
    StringBuilder ans = new StringBuilder();
    for(int node: actualTopo) {
        ans.append((char)(node + 'a'));
    }
    return ans.toString();
    }
}
