package scanner;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		
		
		String name;
		
		name = sc.nextLine();
		
		System.out.printf(name + "님의 국어 점수: ");
		int kor;
		kor = sc.nextInt();
		
		System.out.printf(name + "님의 영어 점수: ");
		
		int eng;
		eng = sc.nextInt();
		
		System.out.printf(name + "님의 수학 점수: ");
		int math;
		math = sc.nextInt();
		
		
		
		
		System.out.println();
		System.out.println("===================");
		System.out.println("이 름 : " + name);
		System.out.println("===================");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + math);
		System.out.println("===================");
		System.out.println("합 계 : " + (kor+eng+math));
		System.out.println("===================");
	}

}
