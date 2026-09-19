class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char [] target = s1.toCharArray();
        Arrays.sort(target);
        int k = s1.length();

        for(int i=0; i<= s2.length() - k;i++) {
            String sub = s2.substring(i, i+k);

            char [] temp = sub.toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(target, temp)) return true;
        }
    return false;
    }
}
