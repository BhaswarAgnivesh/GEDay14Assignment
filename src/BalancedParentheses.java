public class BalancedParentheses {

    public static void main(String[] args) {
        String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        System.out.println("checked expression: " + expression);

        char[] stack = new char[expression.length()];
        int top = -1;
        boolean isBalanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                top++;
                stack[top] = ch;
            }
            else if (ch == ')') {
                if (top == -1) {
                    isBalanced = false;
                    break;
                } else {
                    top--;
                }
            }
        }
        if (top != -1) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("balanced paranthesis");
        } else {
            System.out.println("unbalanced");
        }
    }
}