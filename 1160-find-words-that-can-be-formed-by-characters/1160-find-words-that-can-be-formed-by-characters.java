class Solution {
    public int countCharacters(String[] words, String chars) {
        // 1. char to hashmap - 100
        // 2. loop words - 1000
        // 3. loop words[i] - 100
        //  -> O(1000 * 100) = O(M*N)
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()){
           map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        
        int result = 0;
        for(String word : words){
            result = canToString(word, new HashMap<>(map)) ? result + word.length() : result;
        }
        return result;
    }
    
    private Boolean canToString(String word, HashMap<Character, Integer> map){
        for(char c : word.toCharArray()){
            int count = map.getOrDefault(c, 0);
            
            if(count < 1){
                return false;
            }else{
                map.put(c, count - 1);
            }
        }
        return true;
    }
}