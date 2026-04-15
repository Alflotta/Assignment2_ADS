import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();

            if (b==1) {
                int c = sc.nextInt();
                list.addFirst(c);
            }
            else if (b==2) {
                int c = sc.nextInt();
                list.addLast(c);
            }
            else if (b==3) {
                System.out.println(list.removeFirst());
            }
            else {
                System.out.println(list.removeLast());
            }




        }
    }
}
