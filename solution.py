class Solution:
    F = [0, 1]
    filled = False
    def fill(self):
        for i in range(2, 31):
            self.F.append(self.F[i - 1] + self.F[i - 2])

    def fib(self, n: int) -> int:
        if not self.filled:
            self.fill()
        
        if n == 0 or n == 1:
            return n
        
        return self.F[n - 1] + self.F[n - 2]
