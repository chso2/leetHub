class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        // 비감소 수열의 시작부분 찾기
        while (left < arr.length - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }
        
        // 이미 비감소 수열이라면 배열 전체가 비감소 수열
        if (left == arr.length - 1) {
            return 0;
        }
        
        // 비감소 수열의 끝부분 찾기
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }
        
        // 한쪽 끝까지 제거한 경우
        int result = Math.min(arr.length - left - 1, right);
        
        // 두쪽 끝 중 하나만 제거한 경우
        int i = 0;
        int j = right;
        while (i <= left && j < arr.length) {
            if (arr[j] >= arr[i]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        
        return result;
    }
}