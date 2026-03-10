import java.util.Scanner;
import java.util.Stack;

public class question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan velocity:");

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        while(stack.peek() < n){

            int next = stack.peek() * 2;

            if(next > n){
                next = n;
            }

            stack.push(next);
        }

        for(int value : stack){
            System.out.print(value + " ");
        }

        sc.close();
    }
}