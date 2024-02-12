class MedianFinder {
    PriorityQueue<Integer> left, right;

    public MedianFinder() {
        left = new PriorityQueue<> ((a, b) -> b - a);
        right = new PriorityQueue<> ();
    }
    
    public void addNum(int num) {
        if (left.isEmpty () || num <= left.peek ()) left.offer (num);
        else right.offer (num);
        if (left.size () - right.size () > 1) right.offer (left.poll ());
        if (right.size () - left.size () > 1) left.offer (right.poll ());
    }
    
    public double findMedian() {
        int left_len = left.size (), right_len = right.size ();
        if (((left_len + right_len) & 1) == 1) return (double) (left_len > right_len ? left.peek () : right.peek ());
        else return (left.peek () + right.peek ()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */