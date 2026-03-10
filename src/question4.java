import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka:");
        String line = sc.nextLine();

        String[] input = line.split(" ");
        int n = input.length;

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }

        // ORDER SYNC PROTOCOL
        Arrays.sort(numbers);

        System.out.println("KASMIR TAMPAN");

        Stack<Integer> stack = new Stack<>();

        for(int num : numbers){
            stack.push(num);
        }

        System.out.println("KASMIR GANTENG BANGET");

        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()){
            System.out.print(temp.pop() + " ");
        }

        sc.close();
    }
}