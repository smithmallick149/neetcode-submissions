class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int low = 0;
        int right = heights.length -1;
        while(low <= right) {
            int area = Math.min(heights[low], heights[right]) * (right - low);
            max = Math.max(max, area);
            if(heights[low] <= heights[right] ){
                low++;
            } else {
                right--;
            }
        }
        return max;
    }
}
