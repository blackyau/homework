import java.util.Scanner;
// Catalan_number
// http://acm.suse.edu.cn/problem.php?cid=1060&pid=2
public class Stack_In_Out {
    static int fun(int a, int b){
        if (a == 0)
            return 1;
        if (b == 0)
            return fun(a - 1, 1);
        return fun(a - 1, b + 1) + fun(a, b - 1);

    }
    static int fun(int a){
        return fun(a,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        for(int i=0; i<list.length; i++){
            System.out.println(fun(list[i]));
        }
    }
}
