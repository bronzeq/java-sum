package sum;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		/*
		 System.out.println("두 수입력");
		Scanner scanner=new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
			
		int 	re=i+j;
			System.out.println("두수의 합은"+ re);		
		 */
		int a,b;
		try (Scanner scanner = new Scanner(System.in)) {
			String s1,s2;
			System.out.println("두 수입력");
			
			
			s1=scanner.next();
			s2=scanner.next();
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
		}
		
		System.out.printf("%d과(와) %d의 합은 %d",a,b,a+b);
		
		
		

	}

}
