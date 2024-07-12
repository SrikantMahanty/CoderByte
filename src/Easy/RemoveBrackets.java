package Easy;

import java.util.Stack;

public class RemoveBrackets {
    public static int removeBrackets(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(!st.isEmpty() && (st.peek()=='(')){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        return st.size();

    }
    public static void main(String[] args) {
        System.out.println(removeBrackets("(())()(((")); // 3
        System.out.println(removeBrackets("(()(")); // 2
        System.out.println(removeBrackets("(()))")); // 1
        System.out.println(removeBrackets("))(()))")); // 3
        System.out.println(removeBrackets("(())")); // 0
    }
}
