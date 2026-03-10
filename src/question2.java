import java.util.Scanner;
import java.util.Stack;
//cgpt

public class question2 {

    public static int evaluateRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result);
            }

            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop() + 13;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan RPN expression (pisahkan dengan spasi)");
        System.out.println("Contoh: 2 1 + 3 *");

        String line = input.nextLine();

        String[] tokens = line.split(" ");

        int result = evaluateRPN(tokens);

        System.out.println("Hasil akhir (ditambah 13): " + result);

        input.close();
    }
}