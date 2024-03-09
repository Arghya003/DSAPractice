class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int s=0,e=0;
        while(s<nums1.length&& e<nums2.length){
            if(nums1[s]<nums2[e])
                s++;
            else if(nums1[s]>nums2[e])
                e++;
            else
                return nums1[s];
        }
        return -1;
    }
}