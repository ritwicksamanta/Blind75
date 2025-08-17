import java.util.Stack;

public class ValidParentheses {
public static void main(String[] args) {
    String str = "()[{]}{}";
    System.out.println("Is Valid : "+Solution.isValid(str));
}


static class Solution{
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            
            if(ch=='('||ch=='['||ch=='{')st.push(ch);//push opening braces
            else{
                if(st.isEmpty()) return false;

                char top = st.pop();

                if(ch==')' && top!='(') return false;
                if(ch==']' && top!='[')return false;
                if(ch=='}' && top!='{')return false;
            }
        }
        return st.isEmpty();
    }
}
}
