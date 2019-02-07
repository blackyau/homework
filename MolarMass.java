import java.util.Scanner;
import java.util.*;


public class MolarMass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			double sum = 0;
			String st = sc.next();
			// �жϳ���
			int len = st.length();
			while(0 < len){
				char[] strArr = st.toCharArray();
				// ������ĸ����������
				char[] letter = new char[len];
				int[] number = new  int[len];
				// ���������1
				Arrays.fill(number, 1);
				int letterIndex = 0;
				// ��ѭ�� �����ж���ĸ��������
				for (int mainIndex=0; mainIndex<len; mainIndex++){
					// ���������ĸ
					if(Character.isLetter(strArr[mainIndex])){
						letter[letterIndex] = strArr[mainIndex];
						letterIndex ++;
						// �����������
					}else if(Character.isDefined(strArr[mainIndex])){
						// �ж���һλ�ǲ�������(��λ��)
						if(mainIndex+1<len&&'0'<=strArr[mainIndex+1]&&strArr[mainIndex+1]<='9'){
							int tempnums = strArr[mainIndex] - '0';
							tempnums = tempnums * 10;
							number[letterIndex-1] = strArr[mainIndex+1] - '0' + tempnums;
							mainIndex ++;
							continue;
						}
						// ������λ��(һλ�������)
						int tempnum = strArr[mainIndex] - '0';
						number[letterIndex-1] = tempnum;
						}
				}
				// ��ʼ���
				for (int mainIndex=0; mainIndex<len; mainIndex++){
					if(letter[mainIndex] == 'H'){
						sum = sum + number[mainIndex]*1.008;
						}else if(letter[mainIndex] == 'C'){
							sum = sum + number[mainIndex]*12.01;
						}else if(letter[mainIndex] == 'O'){
							sum = sum + number[mainIndex]*16.00;
						}else if(letter[mainIndex] == 'N'){
							sum = sum + number[mainIndex]*14.01;
						}
				}
				System.out.printf("%.3f\n",sum);
				len = 0;
			}
		}
	}
}