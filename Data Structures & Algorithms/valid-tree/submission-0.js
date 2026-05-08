class UnionFind {
    constructor(n){
        this.parent = Array(n).fill(0).map((_,i) =>i);
        this.rank = Array(n).fill(1)
    }

    find(node){
        if(this.parent[node] !== node){
            this.parent[node] =this.find(this.parent[node])
        }
        return this.parent[node]
    }

    union(node1,node2){
        let root1 = this.find(node1)
        let root2 = this.find(node2)

        if(root1 === root2) return false

        if(this.rank[root1] > this.rank[root2]){
            this.parent[root2] = root1
        } else if(this.rank[root1] < this.rank[root2]){
            this.parent[root1] = root2
        } else {
            this.parent[root2] = root1;
            this.rank[root1]++;
        }
        return true;
    }
}
class Solution {
    /**
     * @param {number} n
     * @param {number[][]} edges
     * @returns {boolean}
     */
    validTree(n, edges) {
        if(edges.length !== n -1) return false;
        const uf = new UnionFind(n);

        for(let [a,b] of edges){
            if(!uf.union(a,b)){
                return false
            }
        }
        return true;
    }
}
