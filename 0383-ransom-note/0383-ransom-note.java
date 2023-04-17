class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Long> ransomNoteMap = getCountingStringMap(ransomNote);
        Map<String, Long> magazineMap = getCountingStringMap(magazine);
        for(String key : ransomNoteMap.keySet()){
            if (!magazineMap.containsKey(key) || magazineMap.get(key) < ransomNoteMap.get(key)) return false;
        }
        return true;
    }
    
    public Map<String, Long> getCountingStringMap(String str) {
        Map<String, Long> resultMap = new HashMap<>();
        Arrays.asList(str.split(""))
            .stream()
            .distinct()
            .forEach(key -> 
                     resultMap.put(key, 
                                   Arrays.asList(str.split(""))
                                        .stream()
                                        .filter(value -> key.equals(value))
                                        .count())
                    );
        return resultMap;
    }
}