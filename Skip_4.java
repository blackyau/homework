import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// http://acm.suse.edu.cn/problem.php?cid=1059&pid=4
public class Skip_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        Skip_4 sn = new Skip_4();
        int out = sn.singleNumber(list);
        System.out.println(out);
    }
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1; // can't find it.
    }
}
