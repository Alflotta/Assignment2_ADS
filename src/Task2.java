import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<x;i++){
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String inde = sc.next();
            if(inde.equals("Insert")){
                int q1 = sc.nextInt();
                int q2 = sc.nextInt();
                list.add(q1,q2);
            }
            else if(inde.equals("Delete")){
                int d1 = sc.nextInt();
                list.remove(d1);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
