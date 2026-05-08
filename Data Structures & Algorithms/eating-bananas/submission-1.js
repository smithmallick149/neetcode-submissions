class Solution {
    /**
     * @param {number[]} piles
     * @param {number} h
     * @return {number}
     */
    findEating(piles, k) {
        let total = 0;
        for(let i =0; i < piles.length;i++){
            total += Math.ceil ( piles[i] / k)
        }
        return total
    }
    minEatingSpeed(piles, h) {
       let low = 1;
       let high = Math.max(...piles);
       let min = high;

        while(low <= high) {
            let mid = Math.floor((low+high)/2)
            let total = this.findEating(piles, mid)

            if(total <= h){
                min = mid;
                high = mid -1 
            } else {
                low =  mid + 1
            }
        }
        return min
    }
}
