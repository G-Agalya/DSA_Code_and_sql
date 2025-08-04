class Solution {
    public int totalFruit(int[] fruits) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        int e=0;
        int s=0;
        int max=Integer.MIN_VALUE;
        while(e<fruits.length){
            int n=fruits[e];
            if(a.size()==0 || a.get(a.size()-1)==n){
                a.add(n);
                e++;
            }
            else if(b.size()==0 || b.get(b.size()-1)==n){
                b.add(n);
                e++;
            }
            else{
                int prev = fruits[e - 1];
                int i = e - 1;
                while (i >= 0 && fruits[i] == prev) {
                    i--;
                }
                s=i+1;
                e=s;
                a.clear();
                b.clear();
            }
            if(max<a.size()+b.size()){
                    max=a.size()+b.size();
            }
        }
        return max;
    }
}