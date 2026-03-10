import java.util.Scanner;
import java.util.Stack;

public class question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int momentum = n;
        stack.push(momentum);

        while(momentum > 1){
            momentum = momentum / 2;
            stack.push(momentum);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
}