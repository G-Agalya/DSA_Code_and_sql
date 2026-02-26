class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        Map<String,Integer> arr1=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            String h=arr[i]+"";
            if(arr1.containsKey(h)){
                h+=" ";
            }
            if(arr1.containsKey(h)){
                h=" "+h;
            }
            arr1.put(h,Integer.bitCount(arr[i]));
        }
        Set<Integer> has=new TreeSet<>(arr1.values());
        int[] res=new int[arr.length];
        int u=0;
        for(int i:has){
            for(String j:arr1.keySet()){
                
                if(i==arr1.get(j)){
                    
                    String o=j.trim();
                    System.out.print(o+" ");
                    int y=Integer.parseInt(o);
                    res[u]=y;
                    u++;
                }
            }
        }
        return res;

    }
}