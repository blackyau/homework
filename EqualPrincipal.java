import java.math.BigDecimal;

//2014 Java C 2
public class EqualPrincipal {
	public static void main(String[] args) {
System.out.println(new BigDecimal(30000-1250*14).multiply(new BigDecimal(0.005)).add(new BigDecimal(1250)).setScale(2, BigDecimal.ROUND_DOWN));
	}

}
