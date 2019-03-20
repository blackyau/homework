//2018 Java C 2
public class Monkey {

	public static void main(String[] args) {
		for(int i=1; i<10000; i++){
			double a = (double) i;
			for (int j = 1; j <= 4; j++) {
              // j是被猴子吃掉的,(f-j)/(double)(5.0)是被猴子藏起来的香蕉
              a = a - j - (a - j) / (double) (5.0);
          }
          if (a % 5 == 0) {
              System.out.println(i);
          }
		}
	}

}
