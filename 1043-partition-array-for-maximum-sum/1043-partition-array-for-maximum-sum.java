class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        // case 1 ) 
        //      arr = [1,15,7,9,2,5,10], k = 3
        //      [15,15,15,9,10,10,10] = 84
        // case 2 ) 
        //      arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
        //      [1, 7, 7, 7, 7, 9, 9, 9, 9, 9, 9] = 83
        
        int[] dp = new int[arr.length];     // dp setting
        for(int i = 0; i < arr.length; i++){
            int curMax = 0;                 // current max value (not dp)
            for(int j = 1; j <= k; j++){
                if(i - j + 1 < 0) break;
                curMax = Math.max(curMax, arr[i - j + 1]);  // k 전까지 한칸씩 이전의 배열 값과 큰지 비교
                dp[i] = Math.max(dp[i], (i >= j ? dp[i - j] : 0) + curMax * j);  
            }
        }
        return dp[arr.length - 1];
    }
}