class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // ban 목록에 없는 원소만 참여함
        // n 을 넘어서는 ban 은 무시해도 됨
        // 두 수의 합이 maxSum 을 넘지 않음
        // 최대로 많이 더할 수 있는 갯수 = 작은 수 부터 조합 하면됨
        
        // ban sorting
        // for n 까지 조회하면서, ban 아닌애들만 새 배열에 put O(n)
        // dp 로 처리하면됨 계속 누적합 계산
        
        int sum = 0;
        int count = 0;
        int banCount = 0;
        Arrays.sort(banned);
        banned = Arrays.stream(banned).distinct().toArray();
        for(int i = 1; i <= n; i++){
            
            if(banCount <= banned.length - 1){
                
                if(banned[banCount] != i){
                    if(sum + i <= maxSum){
                        sum += i;
                        count++;
                    }else {
                        return count;
                    }
                }else {
                    banCount++;
                }
            }else{
                if(sum + i <= maxSum){
                        sum += i;
                        count++;
                 }
            } 
        }
        return count;
        
    }
}