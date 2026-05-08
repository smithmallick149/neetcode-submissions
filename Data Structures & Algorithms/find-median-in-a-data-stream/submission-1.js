class MedianFinder {
    constructor() {
        this.arr = []
    }

    /**
     *
     * @param {number} num
     * @return {void}
     */
    addNum(num) {
        this.arr.push(num);
    }

    /**
     * @return {number}
     */
    findMedian() {
        this.arr.sort((a, b) => a- b);
        let n = this.arr.length;
        if(n & 1) {
            return this.arr[Math.floor(n /2)];
        } else {
            return (this.arr[n / 2] + this.arr[n / 2 - 1]) / 2;
        }
    }
}
