import java.util.Stack;

public class Leetcode_20{
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
           char[] parenthesis = s.toCharArray();
           int n = parenthesis.length;

           Stack<Character> st = new Stack<>();
           for (int i=0; i<n; i++){
               if (parenthesis[i] == '(' || parenthesis[i] == '{' || parenthesis[i] == '['){
                   st.push(parenthesis[i]);
               }else{
                   //parenthesis[i] == ')' || parenthesis[i] == '}' || parenthesis[i] == ']'
                   if (parenthesis[i] == ')') {
                       if (!st.isEmpty() && st.peek() == '(') {
                           st.pop();
                       } else {
                           return false;
                       }
                   } else if (parenthesis[i] == '}') {
                       if (!st.isEmpty() && st.peek() == '{') {
                           st.pop();
                       } else {
                           return false;
                       }
                   } else if (parenthesis[i] == ']') {
                       if (!st.isEmpty() && st.peek() == '[') {
                           st.pop();
                       } else {
                           return false;
                       }
                   }
               }
           }
           return st.isEmpty();
    }
}