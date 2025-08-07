class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Get counts of needed characters (using 0 if missing)
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; // need 2 'l'
        int o = map.getOrDefault('o', 0) / 2; // need 2 'o'
        int n = map.getOrDefault('n', 0);

        // Return minimum possible complete "balloon" words
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
