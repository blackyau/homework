import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

// 2017 Java C 4

public class Pressure {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[][] a = new double[29][30];//如果开[29][29],会越界。少一个if提高效率。
	for(int i=0; i<29; i++){
		for(int j=0; j<i+1; j++){
			a[i][j] = sc.nextDouble();
		}
	}
	for(int i=0; i<28; i++){//不能走到最后一行去 
		for(int j=0; j<i+1; j++){
			a[i+1][j] += a[i][j]/2.0;
			a[i+1][j+1] += a[i][j]/2.0;
		}
	}
	Arrays.sort(a[28]);
	BigDecimal min = new BigDecimal("2086458231").divide(new BigDecimal(a[28][1]));
	System.out.println(min.multiply(new BigDecimal(a[28][29])));
	}

}