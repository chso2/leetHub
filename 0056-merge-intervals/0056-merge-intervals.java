class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,3}{2,6}{8,10}{15,18}
        });
        
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] last = result.get(result.size() - 1);
            
            if(isInclude(last, intervals[i])){
                last[1] = Math.max(intervals[i][1], last[1]);
            }else{
                result.add(intervals[i]);   
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    private Boolean isInclude(int[] pre, int[] next){
        if(next[0] <= pre[1]){
            return true;
        }
        return false;   
    }
}