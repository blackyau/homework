import java.util.Scanner;
// http://acm.suse.edu.cn/problem.php?cid=1059&pid=2
public class Reverse_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if(i<j && list[i]>list[j]){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
