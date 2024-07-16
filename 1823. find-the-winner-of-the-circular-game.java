class Solution {
    public static int findTheWinner(int n, int k) {
        Queue<Integer> qu = new LinkedList<>();
        for(int i=1; i<=n; i++){
            qu.add(i);
        }
        while(qu.size()!=1){
            for(int i=0; i<k-1; i++){
                qu.add(qu.remove());
            }
            qu.remove();
        }
        return qu.peek();
    }
}