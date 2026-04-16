import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Task5 {

    public static int countStudents(int[] students, int[] samsas) {
        Queue<Integer> q = new LinkedList<>();

        for (int s : students) {
            q.offer(s);
        }
        int i = 0;
        int count = 0;
        while (!q.isEmpty() && count < q.size()) {
            if (q.peek() == samsas[i]) {
                q.poll();
                i++;
                count = 0;
            } else {
                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.replaceAll("[^0-9,]", "");
        s2 = s2.replaceAll("[^0-9,]", "");

        String[] arr1 = s1.split(",");
        String[] arr2 = s2.split(",");

        // создаём массивы
        int[] students = new int[arr1.length];
        int[] samsas = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            students[i] = Integer.parseInt(arr1[i]);
            samsas[i] = Integer.parseInt(arr2[i]);
        }
        System.out.println(countStudents(students, samsas));
    }
}