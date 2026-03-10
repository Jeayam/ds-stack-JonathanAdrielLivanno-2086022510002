import java.util.Scanner;
import java.util.Stack;

//cgpt
public class question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah angka:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan angka:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for(int num : arr){

            while(!stack.isEmpty() && stack.peek() > num){
                System.out.print(stack.pop() + " ");
            }

            stack.push(num);
        }

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