class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int left = 0;
        int right = people.length - 1;

        while(left <= right) {
            int currSum = people[left] + people[right];
            if(currSum <= limit) {
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}