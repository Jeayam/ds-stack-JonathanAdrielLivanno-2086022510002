import java.util.Scanner;
import java.util.Stack;
//cgpt
public class question1 {

    public static boolean is_balanced(String s) {

        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            String bracket = String.valueOf(c);

            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {

                stack.push(bracket);
            }

            else if (bracket.equals(")") || bracket.equals("}") || bracket.equals("]")) {

                if (stack.isEmpty()) {
                    return false;
                }

                String top = stack.pop();

                if (bracket.equals(")") && !top.equals("(")) return false;
                if (bracket.equals("}") && !top.equals("{")) return false;
                if (bracket.equals("]") && !top.equals("[")) return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bracket: ");
        String s = input.nextLine();

        boolean result = is_balanced(s);

        if (result) {
            System.out.println("Bracket BALANCED");
        } else {
            System.out.println("Bracket NOT BALANCED");
        }

        input.close();
    }
}