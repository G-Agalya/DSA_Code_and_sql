class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> arr=new Stack<>();
        arr.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            
                
            if(!arr.isEmpty() && arr.peek()==s.charAt(i)){
                arr.pop();
            
            }
            else{
                arr.push(s.charAt(i));
            }
            
        }
        StringBuilder str=new StringBuilder();
        while(!arr.isEmpty()){
            str.append(arr.pop()+"");
        }
        
        return str.reverse().toString();
    }
}