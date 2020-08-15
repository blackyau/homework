import java.util.Scanner;
// http://acm.suse.edu.cn/problem.php?cid=1059&pid=2
public class Find_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        for(int i=0; i<list.length; i++){
            boolean flag = false;
            for(int j=0; j<list.length-1; j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)break;
        }
        System.out.println(list[m-1]);
    }

}
