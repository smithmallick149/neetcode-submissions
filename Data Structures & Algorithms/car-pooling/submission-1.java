class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        List<int[]> events = new ArrayList<>();

        for(int [] trip: trips) {
            int passenger = trip[0];
            int from = trip[1];
            int to = trip[2];

            events.add(new int[]{from, passenger});
            events.add(new int[]{to, -passenger});
        }

        events.sort((a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
int currPassengerCap = 0;
        for(int[] event: events) {
            currPassengerCap += event[1];
            if(currPassengerCap > capacity) return false;
        }
        return true;
    }
}