class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        if (slen < plen) return result;

        int[] sCount = new int[26]; // freq for current window in s
        int[] pCount = new int[26]; // freq for string p

        // Build frequency count for p
        for (int i = 0; i < plen; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        // Check initial window
        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = plen; i < slen; i++) {
            sCount[s.charAt(i) - 'a']++; // add right char
            sCount[s.charAt(i - plen) - 'a']--; // remove left char

            if (Arrays.equals(sCount, pCount)) {
                result.add(i - plen + 1);
            }
        }

        return result;
    }
}
