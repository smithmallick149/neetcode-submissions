class Pair{
    private int key;
    private int value;
    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
    public int getKey(){
        return this.key;
    }
    public int getValue(){
        return this.value;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
    (a, b) -> {
        if(a.getKey() != b.getKey()) {
            return b.getKey() - a.getKey();
        }
        return b.getValue() - a.getValue();
    }
);
        for(int num: arr) {
            int diff = Math.abs(num - x);
            maxHeap.offer(new Pair(diff, num));
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().getValue());
        }
        Collections.sort(result);
        return result;
    }
}