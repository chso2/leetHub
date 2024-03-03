class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] cArr = keysPressed.toCharArray();
        char slowestKey = cArr[0];
        int longestDuration = releaseTimes[0];
        
        for(int i = 1; i < cArr.length; i++){
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > longestDuration || (duration == longestDuration && cArr[i] > slowestKey)) {
                slowestKey = cArr[i];
                longestDuration = duration;
            }
        }
        
        return slowestKey;
    }
}