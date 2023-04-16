class Solution {
    public int numberOfSteps(int num) {
        Solution solution = new Solution();
        return solution.recursiveCountSteps(num, 0);
    }
    
    public int recursiveCountSteps(int num, int step) {
        if (num == 0) return step;
        int result = num % 2 == 0 ? num / 2 : num - 1;
        return result == 0 ? step + 1 : recursiveCountSteps(result, step + 1);
    }
}