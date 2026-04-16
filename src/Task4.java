import java.util.*;

public class Task4 {
    static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String p : parts) {
            stack.push(Integer.parseInt(p));
        }
        reverse(stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
    }
}
