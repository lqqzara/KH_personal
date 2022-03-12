package note220307;

public class Example003 {

	public static void main(String[] args) {
		/*
		 * 형 변환(Casting): 자료형을 변환
		 * 		1. 값 처리의 원칙
		 * 		-같은 자료형만 대입 가능
		 * 		-같은 자료형만 연산 할 수 있다.
		 * 		-연산 값도 같은 자료형만 나옴  
		 * 		
		 * 		2. 종류
		 * 		-자동 형변환: 작은 자료형-->큰 자료형으로 자동 변환
		 * 		-강제 형변환: 큰 자료형-->작은 자료형으로 강제 변환
		 * 			*방법: 값 앞에(자료형)을 붙임
		 * 			*주의사항: 데이터 손실이 있을 수 있음
		 * 		
		 */
		int i1=1000;
		byte b1;
		short s1;
		
		b1=(byte)i1;//큰 자료형-->작은 자료형
		System.out.println(i1);
		System.out.println(b1);
		
		s1=(short)i1;
		System.out.println(i1);
		System.out.println(s1);
		
		char c1='a';
		char c2=65;//<--아스키코드값
		System.out.println(c1);//a
		System.out.println(c2);//A
		
		float f1=4.0f;
		int i2;
		i2=(int)f1;
		i2=10+(int)f1;
		System.out.println(i2);
		
				
		
	}

}
