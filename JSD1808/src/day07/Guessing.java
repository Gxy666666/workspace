 package day07;
import java.util.Scanner;
//���ַ�С��Ϸ
public class Guessing {
	//������
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //��ȡ����ַ�����
		System.out.println(chs); //����
		int count = 0; //�´�Ĵ���
		while(true) { //������ѭ��
			System.out.println("�°�!");
			String str = scan.next().toUpperCase(); //�����û�������ַ���
			if(str.equals("EXIT")) { //�ж�str�����Ƿ���EXIT
				System.out.println("�´�������!");
				break;
			}
			char[] input = str.toCharArray(); //���ַ���ת��Ϊ�ַ�����
			int[] result = check(chs,input); //�Ա�:����ַ��������û�������ַ�����
			if(result[0]==chs.length) { //��
				int score = 100*chs.length-10*count; //һ���ַ�100�֣��´�һ�ο�10��
				System.out.println("��ϲ��¶��ˣ��÷�Ϊ:"+score);
				break; //����ѭ��
			}else { //��
				count++; //�´������1
				System.out.println("�ַ��Ը���Ϊ:"+result[1]+"��λ�öԸ���Ϊ:"+result[0]);
			}
		}
		
	}
	
	//��������ַ�����chs
	public static char[] generate() {
		char[] chs = new char[5]; //����ַ�����
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //����ַ���Χ����
		boolean[] flags = new boolean[letters.length]; //��������(��letters���Ӧ)
		for(int i=0;i<chs.length;i++) { //��������ַ�����
			int index;
			do {
				index = (int)(Math.random()*letters.length); //����±�(0��25)
			}while(flags[index]==true); //���±�index��Ӧ�Ŀ���Ϊtrueʱ����ʾ��Ӧ�ַ��Ѵ��������������index�±�
			                            //���±�index��Ӧ�Ŀ���Ϊfalseʱ����ʾ��Ӧ�ַ�δ�������ѭ������
			chs[i] = letters[index]; //�����±�index��letters�л�ȡ�ַ�����ֵ��chs�е�ÿһ��Ԫ��
			flags[index] = true; //���±�index��Ӧ�Ŀ����޸�Ϊtrue����ʾ��Ӧ�ַ��Ѵ��
		}
		//i=0 index=0        chs[0]='A' flags[0]=true
		//i=1 index=25       chs[1]='Z' flags[25]=true
		//i=2 index=0/25/0/1 chs[2]='B' flags[1]=true

		return chs;
	}
	
	//�Ա�:����ַ�����chs���û�������ַ�����input
	public static int[] check(char[] chs,char[] input) {
		int[] result = new int[2]; //�ԱȽ��(0,0)--result[0]Ϊλ�öԣ�result[1]Ϊ�ַ���
		for(int i=0;i<chs.length;i++) { //��������ַ�����
			for(int j=0;j<input.length;j++) { //�����û�������ַ�����
				if(chs[i]==input[j]) { //�ַ���
					result[1]++; //�ַ��Ը�����1
					if(i==j) { //λ�ö�
						result[0]++; //λ�öԸ�����1
					}
					break; //ʣ��inputԪ�ز��ٲ��뱾�ֱȽ���
				}
			}
		}
		return result;
	}
	
}
















