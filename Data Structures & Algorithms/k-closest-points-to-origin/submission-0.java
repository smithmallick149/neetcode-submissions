class Solution {
    class Pair {
        int[] point;
        int distance;

        Pair(int[] point, int distance) {
            this.point = point;
            this.distance = distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        int[][] result = new int[k][2];
        for (int i = 0; i < points.length; i++) {
            int sq = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);

            minHeap.offer(new Pair(points[i], sq));
        }
            int i = 0;

            while (i < k) {
                Pair pair = minHeap.poll();
                result[i] = pair.point;
                i++;
            }
            return result;
        }
    }
