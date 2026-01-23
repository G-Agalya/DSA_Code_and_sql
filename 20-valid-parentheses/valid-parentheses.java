import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                arr.push(s.charAt(i));
            }
            else{
                if(!arr.isEmpty() && ((arr.peek()=='(' && s.charAt(i)==')') || (arr.peek()=='{' && s.charAt(i)=='}') || (arr.peek()=='[' && s.charAt(i)==']'))){
                    arr.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(arr.isEmpty()){
            return true;
        }
        return false;
    }
}