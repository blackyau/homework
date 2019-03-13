import java.math.BigDecimal;
import java.math.BigInteger;

//2015 Java C 3
public class InfiniteScore {
	public static void main(String[] args) {
		BigDecimal fn = new BigDecimal(BigInteger.ONE);
		for(int i=10; i>0; i--){
			BigDecimal cont = new BigDecimal(BigInteger.valueOf(i));
			fn = cont.divide(fn.add(cont), 5, BigDecimal.ROUND_HALF_UP);
		System.out.println(fn.toPlainString());
		}
	}

}
