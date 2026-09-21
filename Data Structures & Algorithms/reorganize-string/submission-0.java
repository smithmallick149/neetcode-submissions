class Solution {
    class Pair{
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    private boolean overlap(StringBuilder sb, char ch) {
        if(sb.length() < 1) return false;
        return sb.charAt(sb.length() -1) == ch;
    }
    public String reorganizeString(String s) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((x, y) -> y.count - x.count);
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            maxHeap.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        while(!maxHeap.isEmpty()) {
            Pair first = maxHeap.poll();

            if(overlap(sb,first.ch)) {
                if(maxHeap.isEmpty()) return "";
                Pair second = maxHeap.poll();
                sb.append(second.ch);
                second.count--;
                if(second.count > 0) {
                    maxHeap.offer(second);
                }
                maxHeap.offer(first);
            } else {
                sb.append(first.ch);
                first.count--;
                if(first.count > 0) {
                    maxHeap.offer(first);
                }
            }
        }
        return sb.toString();

    }
}