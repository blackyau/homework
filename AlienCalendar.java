import java.math.BigDecimal;

//2017 Java C 1
public class AlienCalendar {

	public static void main(String[] args) {
		BigDecimal end = new BigDecimal("651764141421415346185");
		BigDecimal temp = end.subtract(new BigDecimal(1));
		String data = temp.remainder(new BigDecimal("9")).toPlainString();
		char s = (char) ('A'+Integer.parseInt(data));
		System.out.println(s);
	}

}
