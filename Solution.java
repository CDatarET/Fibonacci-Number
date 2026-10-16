class Solution {
    private static int[] F = new int[31];
    private static boolean filled = false;
    private void fill(){
        F[0] = 0;
        F[1] = 1;
        for(int i = 2; i < 31; i++){
            F[i] = F[i - 1] + F[i -2];
        }
    }

    public int fib(int n) {
        if(!filled){
            fill();
        }

        if(n == 0 || n == 1){
            return n;
        }

        return F[n - 1] + F[n - 2];
    }
}
