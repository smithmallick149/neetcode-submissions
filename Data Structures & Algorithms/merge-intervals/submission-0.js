class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number[][]}
     */
    merge(intervals) {
        if(intervals.length === 0) return [];
        intervals.sort((a, b) => a[0] - b[0]);
        const result = [intervals[0]];

        for(let i=0; i< intervals.length;i++){
            let current = intervals[i];
            let last = result[result.length - 1];

            // overlap condition
            if(current[0] <= last[1]){
                last[1] = Math.max(last[1], current[1])
            } else {
                result.push(current)
            }
        }
        return result;
    }
}
