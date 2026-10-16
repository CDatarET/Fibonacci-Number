class Solution {
    private:
        inline static vector<int> F = {0, 1};
        inline static bool filled = false;
        void fill(){
            for(int i = 2; i < 31; i++){
                F.push_back(F[i - 1] + F[i - 2]);
            }

            filled = true;
        }

    public:
        int fib(int n) {
            if(!filled) fill();
            if(n == 0 || n == 1) return n;
            return F[n - 1] + F[n - 2];
        }
};
