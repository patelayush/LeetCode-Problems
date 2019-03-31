class RecentCounter {

    Queue<Integer> q = new LinkedList<Integer>();
    public RecentCounter() {
        this.q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.size()!=0)
        {
            if(q.peek() < t-3000 || q.peek() > t)
                q.poll();
            else break;
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */