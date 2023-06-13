package operator;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("수 입력 : ");
		
		int num;
		
		num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(num + " = " + result);
		
		String result2 = (num % 3 == 0) ? "3의 배수입니다" : "3의 배수가 아닙니다";
		
		System.out.println(num + " = " + result2);
		
		System.out.printf("두 수 입력 : ");
		
		int n1;
		
		
		n1 = sc.nextInt();
		
		int n2;
		
		n2 = sc.nextInt();
		
		System.out.println("num1 : " + n1 + " num2 : " + n2);
		String result3 = (n1 > n2) ? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(result3);
		
		
	}

}
