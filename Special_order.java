import java.util.Scanner;
// http://acm.suse.edu.cn/problem.php?cid=1059&pid=3
public class Special_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        for(int i=0; i<list.length; i++){ // 冒泡排序
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
        for(int i=list.length-1; i>=0; i--){
            if(list[i]%2 != 0){ // 奇数
                System.out.print(list[i]+" ");
            }
        }
        for(int i=0; i<list.length; i++){
            if(list[i]%2 == 0){ // 偶数
                System.out.print(list[i]+" ");
            }
        }
    }
}
