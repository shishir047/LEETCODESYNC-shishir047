class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []freq = new int [1001];
        int [] ans = new int [1001];
        int count = 0;
        for(int i :nums1){
            freq[i]++;
        }
        for(int j: nums2){
            if(freq[j]>0){
                freq[j]--;
                ans[count] = j;
                count++;
            }
        }
        return Arrays.copyOfRange(ans, 0, count);
    }
}