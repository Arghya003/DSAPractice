class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st= new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);

        }
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            nums[i]=st.empty()?-1:st.peek();
            st.push(n);
        }
        return nums;
    }
}