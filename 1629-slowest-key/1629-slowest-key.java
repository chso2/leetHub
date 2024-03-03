class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        char[] cArr = keysPressed.toCharArray();
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(cArr[0], releaseTimes[0]);
        for(int i = 1; i < cArr.length; i++){
            map.put(cArr[i], Math.max(map.getOrDefault(cArr[i], 0), releaseTimes[i] - releaseTimes[i - 1]));
        }
        
        char slowestKey = cArr[0]; //slowKey 초기화
        
        // 가장 오래 누른 키를 찾기
        for (char key : map.keySet()) {
            if (map.get(key) > map.get(slowestKey) || 
               (map.get(key) == map.get(slowestKey) && key > slowestKey)) {
                slowestKey = key;
            }
        }
        
        return slowestKey; 
    }
}