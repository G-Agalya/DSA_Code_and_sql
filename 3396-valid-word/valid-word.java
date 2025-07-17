class Solution {
    public boolean isValid(String word) {
        int v = 0;
        int c1 = 0;

        if (word.length() < 3) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; // contains invalid character
            }

            if ("aeiouAEIOU".indexOf(c) >= 0) {
                v++;
            } else if (Character.isLetter(c)) {
                c1++;
            }
        }

        return v >= 1 && c1 >= 1;
    }
}
