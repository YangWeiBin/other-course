package onest.net;

import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		String str = "Hello";
//		int x = 10, y = 20;
//		System.out.println(x > y ? x : y);
//		int i1 = -10;
//		int i2 = +20;
//		System.out.println(i1 + i2);
		
//		int i3 = -1;
//		System.out.println(i3 >> 2);
//		System.out.println(i3 >>> 2);
		
//		long l1 = 10L;
//		double d1 = 10.0;
//		System.out.println(l1 + d1);
		//������ʽ�У�����double���ͣ���ת��double����
		//������ʽ�У�����float���ͣ���ת��float����
		//������ʽ�У�����long���ͣ���ת��long����
		//char��short��byte���Ͳ�������ʱ��������ת��int����
//		char c1 = 'A';
//		int i4 = 10;
//		System.out.println(c1 + i4);
		
//		byte b1 = 12;
//		short s1 = 123;
		
		//��������������һ���������������
//		Scanner input = new Scanner(System.in);
//		System.out.println("�������һ����������");
//		int num1 = input.nextInt();
//		System.out.println("������ڶ�����������");
//		int num2 = input.nextInt();
//		System.out.println("�������������");
//		String opt = input.next();
//		char c = opt.charAt(0);
//		int result = 0;
//		//switch���ʽ��������byte��short��int��char��String��ö��
//		switch(opt) {
//		case "+":
//			result = num1 + num2;
//			break;
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
//		}
//		System.out.println("������Ϊ��" + result);
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		Demo demo = new Demo();
//		System.out.println(demo.add(5, 10));
		
		//���������
//		Random ran = new Random();
//		int res = ran.nextInt(100);
//		int num1 = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("������һ��������");
//		while(num1 != res) {
//			num1 = input.nextInt();
//			if(num1 > res) {
//				System.out.println("����");
//			}else if(num1 < res) {
//				System.out.println("С��");
//			}else {
//				
//			}
//		}
//		System.out.println("�¶���" + num1);
		
//		int[] nums = {1,2,3,4};
//		for(int i : nums) {
//			System.out.println(i);
//		}
		System.out.println(Float.floatToIntBits(3.14f));
	}
	
	int add(int num1, int num2) {
		int result = 0;
		for(int i = num1; i <= num2; i++) {
			result += i;
		}
		return result;
	}
}
