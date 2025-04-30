import java.util.Stack;

public class LeetCode20 {
    public static boolean checkValidParenthesis(String checkString){
        Stack<Character> myCharStack = new Stack<>();
        for(char c : checkString.toCharArray()){
            if(c == '(' || c== '{' || c=='['){
                myCharStack.push(c);
            }else if(c == ')' || c=='}' || c==']'){
                if(myCharStack.isEmpty()){
                    return false;
                }
                char top = myCharStack.pop();
                if((c==')' && top!= '(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                    return false;
                }
            }
        }
        return myCharStack.isEmpty();
    }
    public static void main(String[] args) {
        String myStr = "{()}";
        System.out.println(checkValidParenthesis(myStr));
    }
}
