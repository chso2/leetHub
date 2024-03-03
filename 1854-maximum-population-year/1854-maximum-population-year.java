class Solution {
    public int maximumPopulation(int[][] logs) {
        // logs = 100 size
        // birth to death = 100 size
        
        // 1. 100 * 100 loop - array
        // 2. sorting & get max
        
        int[] years = new int[101]; 
        
        for(int[] log : logs){
            for(int i = log[0]; i < log[1]; i++){
                years[i - 1950]++;
            }
        }
        
        int maxPopulation = 0;
        int maxYear = 0;
        for(int i = 0; i < years.length; i++){
             if(years[i] > maxPopulation){
                maxYear = i + 1950; // 연도로 변환
                maxPopulation = years[i];
            }
        }
        
        return maxYear;
    }
}