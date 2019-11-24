import java.math.BigInteger;
import java.util.Scanner;

public class EndZeroCount {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input<5){
            System.out.println(0);
            System.exit(0);
        }
        BigInteger now = BigInteger.valueOf(input);
        BigInteger i = BigInteger.ONE;
        BigInteger out = i;
        BigInteger ten = BigInteger.valueOf(10);
        for (; i.compareTo(now)==-1; i=i.add(BigInteger.ONE)){
            out = out.multiply(i.add(BigInteger.ONE));
        }
        while (out.remainder(ten)==BigInteger.ZERO){
            out = out.divide(ten);
            count++;
        }
        System.out.println(count);
    }
}
