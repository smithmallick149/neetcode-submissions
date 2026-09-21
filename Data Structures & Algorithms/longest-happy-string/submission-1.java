class Solution {
    private int getMax(int []count, int repeated) {
        int idx = -1;
        int max = 0;
        for(int i=0;i <3;i++) {
            if(i == repeated || count[i] == 0) {
                continue;
            }
            if(max < count[i]){
                max = count[i];
                idx = i;
            }
        }
        return idx;
    }
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int []count = {a, b, c};

        int repeated = -1;
        while(true) {
            int maxCh = getMax(count, repeated);
            if(maxCh == -1) break;
            sb.append((char) (maxCh + 'a'));
            count[maxCh]--;
            if(sb.length() > 1 && sb.charAt(sb.length() -1) == sb.charAt(sb.length() -2)) {
                repeated = maxCh;
            } else {
                repeated = -1;
            }
        }
        return sb.toString();
    }
}