import java.util.*;

public class question3 {
//cgpt
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] target = new int[n];

        for(int i = 0; i < n; i++) {
            target[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder program = new StringBuilder();

        for(int value : target){

            stack.push(1);
            program.append("1");

            while(stack.peek() < value){

                int top = stack.peek();

                stack.push(top + 13);
                program.append("d");

                if(stack.size() >= 2){

                    int a = stack.pop();
                    int b = stack.pop();

                    stack.push(a + b);
                    program.append("+");
                }
            }
        }
        System.out.println(program.toString());
    }
}