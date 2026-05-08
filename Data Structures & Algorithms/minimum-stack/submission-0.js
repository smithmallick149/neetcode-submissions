class MinStack {
    constructor() {
        this.arr = []
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
         if (this.arr.length === 0) {
            this.arr.push([val, val]);
        } else {
            const currentMin = this.arr[this.arr.length - 1][1];
            this.arr.push([val, Math.min(val, currentMin)]);
        }
    }

    /**
     * @return {void}
     */
    pop() {
       return this.arr.pop();
    }

    /**
     * @return {number}
     */
    top() {
        return this.arr[this.arr.length - 1][0]
    }

    /**
     * @return {number}
     */
    getMin() {
        return this.arr[this.arr.length - 1][1]
    }
}
