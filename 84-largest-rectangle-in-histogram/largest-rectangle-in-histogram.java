class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        Stack<Integer>st= new Stack<>();
        int [] lp=new int[n];
        int rp[]= new int [n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[i]<=heights[st.peek()])
            st.pop();

            if(st.isEmpty())
            lp[i]=0;
            else
            lp[i]=st.peek()+1;

            st.push(i);
        }
        
        while (!st.isEmpty()) st.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) rp[i] = n - 1;
            else rp[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;

        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rp[i] - lp[i] + 1));
        }
        return maxA;
    
    }
}