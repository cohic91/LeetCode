import java.util.Arrays.*;

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
            .map(account -> Arrays.stream(account).reduce(0, Integer::sum))
            .reduce(Integer::max)
            .get();
    }
}