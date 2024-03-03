class Solution {
    public int maxOperations(int[] nums) {
        // Q. 2개씩 차례대로 빼는데, 이 때 2개의 합이 몇번까지 같을 수 있는가?
        // num.length <= 100
        // num[i] <= 1000
        // O(M * N)
        int sum = nums[0] + nums[1];
        int count = 1;
        for(int i = 2; i < nums.length; i += 2){
            if(i == nums.length - 1) break; 
            
            if(nums[i] + nums[i + 1] == sum) {
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}