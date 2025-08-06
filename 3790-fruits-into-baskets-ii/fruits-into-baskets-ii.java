class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<baskets.length;i++){
            arr.add(i);
        }
        boolean flag=false;
        int sum=0;
        for(int i=0;i<fruits.length;i++){
            flag=false;
       for (int k = 0; k < arr.size(); k++) {
                int j = arr.get(k);
                if(fruits[i]<=baskets[j]){
                   flag=true;
                   arr.remove(k);
                   k--;
                   break;
                }
            }    
            if(!flag){
                sum++;
            }
        }
        return sum;
    }
}