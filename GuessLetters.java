//2014 Java C 3
public class GuessLetters {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();
		for(int i=1; i<106; i++){
			a.append("abcdefghijklmnopqrs");
		}
		while (a.length() > 1) {
			for(int i=0; i<a.length(); i++){
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}

}
