import java.util.Map.Entry;

class Solution {
    
    static class SoldiersInRow {
        int row;
        int soldiers;

        public SoldiersInRow(int row, int soldiers) {
            this.row = row;
            this.soldiers = soldiers;
        }

        public int getRow() {
            return this.row;
        }

        public int getSoldiers() {
            return this.soldiers;
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> arr = 
            Arrays.stream(mat)
                .map(item -> 
                    Arrays.stream(item)
                        .boxed()
                        .reduce(Integer::sum)
                        .get())
                .collect(Collectors.toList());
        
        List<SoldiersInRow> sirList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            SoldiersInRow sir = new SoldiersInRow(i, arr.get(i));
            sirList.add(sir);
		}
        
        return sirList.stream()
                    .sorted(Comparator.comparing(SoldiersInRow::getSoldiers))
                    .limit(k)
                    .mapToInt(SoldiersInRow::getRow)
                    .toArray();
    }
}