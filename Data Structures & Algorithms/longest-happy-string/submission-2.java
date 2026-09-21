class Solution {
    class Pair{
        int count;
        char ch;
        Pair(int count, char ch) {
            this.count= count;
            this.ch = ch;
        }
    }
    public boolean createsThree(StringBuilder sb, char ch){
        if(sb.length() < 2) return false;
        return sb.charAt(sb.length() - 1) == ch && sb.charAt(sb.length() - 2) == ch;
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> y.count - x.count);
        if(a > 0) pq.add(new Pair(a, 'a'));
        if(b > 0) pq.add(new Pair(b, 'b'));
        if(c > 0) pq.add(new Pair(c, 'c'));

    StringBuilder sb = new StringBuilder();
    while(!pq.isEmpty()) {
        Pair first = pq.poll();

        if(createsThree(sb, first.ch)) {
            if(pq.isEmpty()) break;

            Pair second = pq.poll();
            sb.append(second.ch);
            second.count--;

            if(second.count > 0){
                pq.add(second);
            }
            pq.add(first);
        } else {
            sb.append(first.ch);
            first.count--;
            if(first.count > 0){
                pq.add(first);
            }
        }
    }
    return sb.toString();
    }
}