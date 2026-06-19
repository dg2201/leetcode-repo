import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> letterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
              if(letterStack.isEmpty()){
                  return false;
                  //if the upcoming character is a closing bracket and the stack is empty then 
                  //instantly return false obv
              }
              else if(letterStack.peek() == '(' && s.charAt(i) == ')'){
                  letterStack.pop();
              }
              else if(letterStack.peek() == '[' && s.charAt(i) == ']'){
                  letterStack.pop();
              }
              else if(letterStack.peek() == '{' && s.charAt(i) == '}'){
                  letterStack.pop();
              }
              else {
                letterStack.push(s.charAt(i));
              }
            }
            else{
                letterStack.push(s.charAt(i));
            }
        }
        return letterStack.isEmpty();
    }
        
}