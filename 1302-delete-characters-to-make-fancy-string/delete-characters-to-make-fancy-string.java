class Solution {
    public String makeFancyString(String s) {
        StringBuilder str =new StringBuilder();
        List<Character> arr = new ArrayList<>();
        List<Character> res = new ArrayList<>();
        
        for (char o : s.toCharArray()) {
            arr.add(o);
            res.add(o);
        }

        int c = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i - 1)) {
                c++;
                if (c >= 3) {
                    res.set(i, '#');  // Mark it for removal later
                }
            } else {
                c = 1; // reset counter
            }
        }

        
        for (char ch : res) {
            if (ch != '#') {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
