import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split("\\s+");

        // Step 1: Length check
        if (words.length != pattern.length()) {
            return false;
        }

        // Step 2: Map pattern char → word
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // If character already mapped
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } 
            // If character not mapped yet
            else {
                // Check bijection (no two chars map to same word)
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word);
            }
        }

        return true;
    }
}
